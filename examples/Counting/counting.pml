#define MAX_PROC 5 // maximum number of concurrent processes
// Global variables, channels, datatypes declarations
byte x;
chan signal = [2] of {bit,mtype}; //external channel
mtype = {msg}; //message to be sent over signal
// Mtype declarations for each machine's state name
mtype = {initState,idle1,counterBox,interrupted,stopped};
mtype = {default,idle2,wait,limit};
mtype = {byOne,byTwo,simpleIncr,doubleIncr,finished};
mtype = {ready,backProp};
mtype = {T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T6_T7_T8,T9_T10_T11};
// Data objects needed to properly model the system 
bit isFirstDescent = 1;
bit HasToken[MAX_PROC];
bit HasFired = 0;
bit dyingPid[MAX_PROC];
bit HasExecuted[MAX_PROC]; //set if pid executed in current step
bit descendantExecuted[MAX_PROC];
bit updateState = 0;
mtype = {term,interrupt}; //messages for termination-signalling channels
//structure needed to keep track of the process hierarchy
typedef childrenArray {
    bit children[MAX_PROC];
}
childrenArray ChildrenMatrix[MAX_PROC];
//global variables for test case gen.
mtype LastState, LastTransition;

proctype Main(pid parent; mtype initial; chan chTerm; chan chTerm_ex) {

	byte i; pid pidTemp;
	//declare channels for termination synch. with children here
	chan chTerm_counterBox_Counter_ex    = [1] of {mtype}; //used to signal the reaching of an exiting state to the caller
	chan chTerm_counterBox_Counter       = [1] of {mtype}; //used to issue termination message in {term,interrupt} to the callee

	mtype state=ready, DSTMstate=initial;
	LastState = DSTMstate;

	printf("Main: started\n");

	do
	// State initState
	:: (DSTMstate == initState && HasToken[_pid] && state==ready) -> atomic {
		printf("Main: in state initState\n");
		HasToken[_pid]=0;
		if
		// Transition T1
		:: ((1) && !descendantExecuted[_pid]) ->
				DSTMstate = idle1; HasFired=1;
				HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
				LastState = DSTMstate; LastTransition = T1;
				printf("Main: fired T1\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				// if this proc did not exec. in this step
				printf("Main: passing token to children\n");
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// State idle1
	:: (DSTMstate == idle1 && HasToken[_pid] && state==ready) -> atomic {
		printf("Main: in state idle1\n");
		HasToken[_pid]=0;
		if
		// Transition T2
		:: ((1) && !descendantExecuted[_pid]) ->
			DSTMstate = counterBox; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T2;
			pidTemp = run Counter(_pid,default,
				chTerm_counterBox_Counter,
				chTerm_counterBox_Counter_ex, 20);
			ChildrenMatrix[_pid].children[pidTemp] = 1;
			printf("Main: fired T2\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// State counterBox
	:: (DSTMstate == counterBox && HasToken[_pid] && state==ready) -> atomic {
		printf("Main: in state counterBox\n");
		HasToken[_pid]=0;
		if
		// Transition T3 (return by interrupt)
		:: ( (signal?[1,msg]) && !descendantExecuted[_pid] ) ->
			DSTMstate = interrupted; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T3;
			chTerm_ex!interrupted; //signal the reaching of final state "interrupted"
			chTerm_counterBox_Counter!interrupt; //send interrupting termination message
			printf("Main: fired T3\n");
		// Transition T4 (return by exiting)
		:: ( chTerm_counterBox_Counter_ex?[limit] && !descendantExecuted[_pid]) ->
			DSTMstate = stopped; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T4;
			chTerm_ex!stopped; //signal the reaching of final state "stopped"
			chTerm_counterBox_Counter!term; //issue termination message
			printf("Main: fired T4\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Main: passing token to children\n");
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// for each final state
	::(DSTMstate==interrupted && chTerm?[term])->{
		printf("Main: dying in interrupted final state\n");
		chTerm?term; goto die
	}
	// for each final state
	::(DSTMstate==stopped && chTerm?[term])->{chTerm?term; goto die}
	// handle upwards propagation of descendantExecuted
	::(state==backProp && descendantExecuted[_pid] && !descendantExecuted[parent]) -> { 
		printf("Main: doing backprop\n");
		descendantExecuted[parent] = 1 
	}
	//handle original state restoring after backProp
	::(state==backProp && HasToken[_pid]) -> 
		{ state = ready }

	od unless (dyingPid[parent] || chTerm?[interrupt]) -> {
		if
		:: (chTerm?[_]) -> chTerm?_
		:: else->skip
		fi
		goto die
	}
	die: dyingPid[_pid]=1
}

proctype Counter(pid parent; mtype initial; chan chTerm; chan chTerm_ex; int P_to) {

	byte i; pid pidTemp;
	//declare channels for termination synch. with children here
	chan chTerm_boxIncr1_Incrementer    = [1] of {mtype};
	chan chTerm_boxIncr2_Incrementer    = [1] of {mtype};
	chan chTerm_boxIncr1_Incrementer_ex = [1] of {mtype};
	chan chTerm_boxIncr2_Incrementer_ex = [1] of {mtype};

	mtype state=ready, DSTMstate=initial;
	LastState = DSTMstate;

	printf("Counter: started\n");

	do
	// state default
	:: (DSTMstate == default && HasToken[_pid] && state==ready) -> atomic {
		printf("Counter: in state default\n");
		HasToken[_pid]=0;
		if
		// Transition T5
		:: ((1) && !descendantExecuted[_pid]) ->
			DSTMstate = idle2; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T5;
			printf("Counter: fired T5\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// state idle2
	:: (DSTMstate == idle2 && HasToken[_pid] && state==ready) -> atomic {
		printf("Counter: in state idle2\n");
		HasToken[_pid]=0;
		if
		// Transition T6_T7_T8
		:: ((1) && !descendantExecuted[_pid]) ->
			DSTMstate = wait; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T6_T7_T8;
			//run the two Incrementer machines
			pidTemp = run Incrementer(_pid,byOne,
				chTerm_boxIncr1_Incrementer,
				chTerm_boxIncr1_Incrementer_ex,P_to);
			ChildrenMatrix[_pid].children[pidTemp] = 1;
			pidTemp = run Incrementer(_pid,byTwo,
				chTerm_boxIncr2_Incrementer,
				chTerm_boxIncr2_Incrementer_ex,P_to);
			ChildrenMatrix[_pid].children[pidTemp] = 1;
			printf("Counter: fired T6_T7_T8\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Counter: passing token to children\n");
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// state wait
	:: (DSTMstate == wait && HasToken[_pid] && state==ready) -> atomic {
		printf("Counter: in state wait\n");
		HasToken[_pid]=0;
		if
		// Transition T9_T10_T11
		:: ((chTerm_boxIncr1_Incrementer_ex?[_]) && !descendantExecuted[_pid]) ->
			DSTMstate = limit; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T9_T10_T11;
			//send termination message to machines
			chTerm_boxIncr1_Incrementer!term;
			chTerm_boxIncr2_Incrementer!interrupt;
			chTerm_boxIncr1_Incrementer_ex?_;
			//reached exit state
			chTerm_ex!limit;
			printf("Counter: fired T9_T10_T11\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Counter: passing token to children\n");
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// for each final state
	::(DSTMstate==limit && chTerm?[term])->{chTerm?term; goto die}
	// handle upwards propagation of descendantExecuted
	::(state==backProp && descendantExecuted[_pid] && !descendantExecuted[parent])
		-> { descendantExecuted[parent] = 1 }
	//handle original state restoring after backProp
	::(state==backProp && HasToken[_pid]) -> { state = ready }

	od unless (dyingPid[parent] || chTerm?[interrupt]) -> {
		if
		:: (chTerm?[_]) -> chTerm?_
		:: else->skip
		fi
		goto die
	}
	die: dyingPid[_pid]=1
}


proctype Incrementer(pid parent; mtype initial; chan chTerm; chan chTerm_ex; int P_limit) {
	
	byte i; pid pidTemp;
	//declare channels for termination synch. with children here

	mtype state=ready, DSTMstate=initial;
	LastState = DSTMstate;

	printf("Incrementer with pid %d started\n",_pid);

	do
	// state byOne
	:: (DSTMstate == byOne && HasToken[_pid] && state == ready) -> atomic {
		printf("Incrementer with pid %d in state byOne\n",_pid);
		HasToken[_pid]=0;
		if
		// Transition T12
		:: ((1) && !descendantExecuted[_pid]) ->
			DSTMstate = simpleIncr; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T12;
			printf("Incrementer with pid %d fired T12\n",_pid);
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Incrementer with pid %d passing token to children\n",_pid);
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// state byTwo
	:: (DSTMstate == byTwo && HasToken[_pid] && state==ready) -> atomic {
		printf("Incrementer with pid %d in state byTwo\n",_pid);
		HasToken[_pid]=0;
		if
		// Transition T13
		:: ((1) && !descendantExecuted[_pid]) ->
			DSTMstate = doubleIncr; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T13;
			printf("Incrementer with pid %d fired T13\n",_pid);
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Incrementer with pid %d passing token to children\n",_pid);
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// state simpleIncr
	:: (DSTMstate == simpleIncr && HasToken[_pid] && state==ready) -> atomic {
		printf("Incrementer with pid %d in state simpleIncr\n",_pid);
		HasToken[_pid]=0;
		if
		// Transition T14
		:: ((x<P_limit) && !descendantExecuted[_pid]) ->
			DSTMstate = simpleIncr; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T14;
			x++; //action
			printf("Incrementer with pid %d fired T14 - x=%d\n",_pid,x);
		// Transition T16
		:: ((x>=P_limit) && !descendantExecuted[_pid]) ->
			DSTMstate = finished; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T16;
			x++; //action
			chTerm_ex!finished; //send termination signal
			printf("Incrementer with pid %d fired T16 - x=%d\n",_pid,x);
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Incrementer with pid %d passing token to children\n",_pid);
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	// state doubleIncr
	:: (DSTMstate == doubleIncr && HasToken[_pid] && state==ready) -> atomic {
		printf("Incrementer with pid %d in state doubleIncr\n",_pid);
		HasToken[_pid]=0;
		if
		// Transition T15
		:: ((1) && !descendantExecuted[_pid]) ->
			DSTMstate = doubleIncr; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T15;
			x=x+2; //action
			printf("Incrementer with pid %d fired T15 - x=%d\n",_pid,x);
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				printf("Incrementer with pid %d passing token to children\n",_pid);
				// if this proc did not exec. in this step
				for (i : 0 .. MAX_PROC-1) {	// pass token to children 
					if
					::(ChildrenMatrix[_pid].children[i])->HasToken[i]=1;
					::else->skip;
					fi;
				}
			::else->skip;
			fi;
		fi;
		state = backProp;
	}
	//for each final state
	::(DSTMstate==finished && chTerm?[term])->{
		printf("Incrementer: dying in finished final state\n");
		chTerm?term; goto die
	}
	// handle upwards propagation of descendantExecuted
	::(state==backProp && descendantExecuted[_pid] && !descendantExecuted[parent]) -> { 
		descendantExecuted[parent] = 1 
	}
	//handle original state restoring after backProp
	::(state==backProp && HasToken[_pid]) -> { state=ready }

	od unless (dyingPid[parent] || chTerm?[interrupt]) -> {
		if
		:: (chTerm?[_]) -> chTerm?_
		:: else->skip
		fi
		goto die
	}
	die: dyingPid[_pid]=1
}


active proctype Engine() {
	pid PidMain; byte i;
	chan chTerm_Main = [1] of {mtype};
	chan chTerm_Main_ex = [1] of {mtype};
	PidMain = run Main(_pid,initState,chTerm_Main,chTerm_Main_ex);
	ChildrenMatrix[_pid].children[PidMain]=1;

	nextStep: // starts a new step
		printf("Engine: starting new step\n");
		atomic {
			// handle external channels management
			bit temp1; mtype temp2;
			if
			:: (len(signal) < 2) -> { // must generate new message
				if
				:: (1) -> {signal!0,msg} // invalid message
				// :: (1) -> {
				// 	signal!1,msg; // valid message
				// 	printf("Engine: generating signal\n");
				// } 
				fi
			}
			:: else -> skip //system already generated next signal step message
			fi
			if
			:: len(signal)==2 -> signal?temp1,temp2
			:: else -> skip //len(signal)=1 on the first step
			fi
			//
			HasFired=0;
			for (i : 0 .. MAX_PROC-1){
				HasExecuted[i]=0;
				descendantExecuted[i]=0;
				HasToken[i] = ChildrenMatrix[_pid].children[i];
			}
		}
		goto waitTimeout;
		
	nextPhase: // starts a new phase in the current step
		atomic {
			printf("Engine: starting new phase\n");
			HasFired=0;
			for ( i : 0 .. MAX_PROC - 1){
				// give token to engine's children
				HasToken[i] = ChildrenMatrix[_pid].children[i];
			}
		}
		goto waitTimeout;

	waitTimeout:
		printf("Engine: waiting for deadlock\n");
		do
		:: timeout -> //deadlock
			if
			:: (!HasFired) -> goto nextStep;
			:: (HasFired) -> goto nextPhase;
			fi;
		od unless (chTerm_Main_ex?[_]) -> {chTerm_Main!term};
}