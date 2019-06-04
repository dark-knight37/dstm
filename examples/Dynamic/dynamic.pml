#define MAX_PROC 50 // maximum number of concurrent processes
// Global variables, channels, datatypes declarations
byte x; int served=0;
chan req = [2] of {bit,mtype}; //external channel
mtype = {msg}; //message to be sent over req
// Mtype declarations for each machine's state name
mtype = {default,waiting}; //dynamic states
mtype = {byOne,byTwo,simpleIncr,doubleIncr,finished}; //Incrementer states
mtype = {ready,backProp};
mtype = {T1,T2_T3_T4,T5_T6_T7};
mtype = {T12,T13,T14,T15,T16};
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

proctype Dynamic(pid parent; mtype initial; chan chTerm; chan chTerm_ex) {
	
	byte i; pid pidTemp;
	//declare channels for termination synch. with children here
	chan chTerm_boxIncr_Incrementer_ex    = [MAX_PROC] of {mtype}; //used to signal the reaching of an exiting state to the caller
	chan chTerm_boxIncr_Incrementer       = [MAX_PROC] of {mtype}; //used to issue termination message in {term,interrupt} to the callee

	mtype state=ready, DSTMstate=initial;
	LastState = DSTMstate;

	printf("Dynamic: started\n");

	do
	// State default
	:: (DSTMstate == default && HasToken[_pid] && state==ready) -> atomic {
		printf("Dynamic: in state default\n");
		HasToken[_pid]=0;
		if
		// Transition T1
		:: ((1) && !descendantExecuted[_pid]) ->
				DSTMstate = waiting; HasFired=1;
				HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
				LastState = DSTMstate; LastTransition = T1;
				printf("Dynamic: fired T1\n");
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				// if this proc did not exec. in this step
				printf("Dynamic: passing token to children\n");
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
	// State waiting
	:: (DSTMstate == waiting && HasToken[_pid] && state==ready) -> atomic {
		printf("Dynamic: in state waiting\n");
		HasToken[_pid]=0;
		if
		// Transition T2_T3_T4
		:: ((req?[1,msg]) && !descendantExecuted[_pid]) ->
			DSTMstate = waiting; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T2_T3_T4;
			pidTemp = run Incrementer(parent,byOne, //async. fork run
				chTerm_boxIncr_Incrementer,
				chTerm_boxIncr_Incrementer_ex, 10);
			ChildrenMatrix[_pid].children[pidTemp] = 1;
			printf("Dynamic: fired T2_T3_T4\n");
		// Transition T5_T6_T7
		:: ((chTerm_boxIncr_Incrementer_ex?[_]) && !descendantExecuted[_pid]) ->
			DSTMstate = waiting; HasFired=1;
			HasExecuted[_pid]=1; descendantExecuted[_pid]=1;
			LastState = DSTMstate; LastTransition = T5_T6_T7;
			ChildrenMatrix[_pid].children[pidTemp] = 1;
			chTerm_boxIncr_Incrementer!term;
			chTerm_boxIncr_Incrementer_ex?_;
			served++;
			printf("Dynamic: fired T5_T6_T7 - served=%d\n",served);
		:: else -> //no transition is executable
			if
			:: (!HasExecuted[_pid]) -> 
				// if this proc did not exec. in this step
				printf("Dynamic: passing token to children\n");
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
		printf("Incrementer with pid %d dying in finished final state\n",_pid);
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
	PidMain = run Dynamic(_pid,default,chTerm_Main,chTerm_Main_ex);
	ChildrenMatrix[_pid].children[PidMain]=1;

	nextStep: // starts a new step
		printf("Engine: starting new step\n");
		atomic {
			// handle external channels management
			bit temp1; mtype temp2;
			if
			:: (len(req) < 2) -> { // must generate new message
				if
				:: (1) -> {req!0,msg} // invalid message
				:: (1) -> {
					req!1,msg; // valid message
					printf("Engine: generating new request\n");
				} 
				fi
			}
			:: else -> skip //system already generated next signal step message
			fi
			if
			:: len(req)==2 -> req?temp1,temp2
			:: else -> skip //len(req)=1 on the first step
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