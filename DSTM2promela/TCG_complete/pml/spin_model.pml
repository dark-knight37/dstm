#define MAX_PROC 50  // maximum number of concurrent processes
mtype LastState, LastTransition;
// Data objects needed to properly model the system 
bit isFirstDescent = 1;
bit HasToken[MAX_PROC];
bit HasFired = 0;
bit dyingPid[MAX_PROC];
bit HasExecuted[MAX_PROC]; //set if pid executed in current step
bit descendantExecuted[MAX_PROC];
bit updateState = 0;
mtype = {term,interrupt}; //messages for termination-signalling channels
mtype = {msg};

mtype = {Main_initial,Main_idle1,Main_interrupted,Main_stopped,Main_counterBox};
mtype = {Counter_default,Counter_idle2,Counter_limit,Counter_boxIncr1_boxIncr2};
mtype = {Incrementer_byOne,Incrementer_byTwo,Incrementer_simpleIncr,Incrementer_doubleIncr,Incrementer_finished};
mtype = {Main_T1,Main_T2,Main_T3,Main_T4};
mtype = {Counter_T5,Counter_T6_T7_T8,Counter_T9_T10_T11};
mtype = {Incrementer_T12,Incrementer_T13,Incrementer_T14,Incrementer_T15,Incrementer_T16};
mtype = {ready,backProp};

//structure needed to keep track of the process hierarchy
typedef childrenArray {
    bit children[MAX_PROC];
}

childrenArray ChildrenMatrix[MAX_PROC];

//global variables for test case gen.
int x;

chan signal = [2] of {bit,mtype};


proctype Main(pid parent; mtype initial;chan chTerm;chan chTerm_interrupted;chan chTerm_stopped) {

	byte i;
	pid PidTemp;

	chan chTerm_counterBox_Counter = [MAX_PROC] of {bit};
	chan chTerm_counterBox_Counter_limit = [MAX_PROC] of {bit};
	mtype state=initial;
	
	do
		:: (state == Main_initial && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						printf("<current>Main_initial</current>\n");
						printf("<transition>Main_T1</transition>\n");
						printf("<next>Main_idle1</next>\n");
						printf("</firing>\n");
						state = Main_idle1;
						LastTransition=Main_T1;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Main_idle1 && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						PidTemp=run Counter(_pid,Counter_default,100,chTerm_counterBox_Counter,chTerm_counterBox_Counter_limit);
						ChildrenMatrix[_pid].children[PidTemp]=1;
						HasToken[PidTemp]=1;
						printf("<current>Main_idle1</current>\n");
						printf("<transition>Main_T2</transition>\n");
						printf("<next>Main_counterBox</next>\n");
						printf("</firing>\n");
						state = Main_counterBox;
						LastTransition=Main_T2;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Main_interrupted && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Main_stopped && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Main_counterBox && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: ((signal?[1,_]) && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						if :: atomic {(signal?[1,_]) -> printf("<phase xsi:type=\"tesqel:Trigger\" order=\"0\" channel=\"signal\" message=\"%d\"/>\n",signal)} :: atomic {else -> skip;} fi;
						if ::(chTerm_counterBox_Counter_limit?[1]) -> chTerm_counterBox_Counter_limit?_; :: else -> skip; fi;
						chTerm_counterBox_Counter!1;
						chTerm_interrupted!1;
						printf("<current>Main_counterBox</current>\n");
						printf("<transition>Main_T3</transition>\n");
						printf("<next>Main_interrupted</next>\n");
						printf("</firing>\n");
						state = Main_interrupted;
						LastTransition=Main_T3;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: (chTerm_counterBox_Counter_limit?[1] && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						chTerm_counterBox_Counter_limit?_;
						chTerm_counterBox_Counter!1;
						chTerm_stopped!1;
						printf("<current>Main_counterBox</current>\n");
						printf("<transition>Main_T4</transition>\n");
						printf("<next>Main_stopped</next>\n");
						printf("</firing>\n");
						state = Main_stopped;
						LastTransition=Main_T4;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == backProp && descendantExecuted[_pid]==1 && didBackProp==0) ->
		    atomic{
				didBackProp=1;
		        descendantExecuted[parent]=1;
		    }
		
		:: (state == backProp && updateState==1)->
			atomic{
				state = nextState;
				state = backProp;
			}

	od unless {
		(chTerm?[1] ||  dyingPid[parent]==1);
		if
			::chTerm?[1] -> chTerm?1;
		fi;
		dyingPid[_pid]=1;
	}

}
proctype Counter(pid parent; mtype initial;int P_to;chan chTerm;chan chTerm_limit) {

	byte i;
	pid PidTemp;

	chan chTerm_boxIncr1_Incrementer = [MAX_PROC] of {bit};
	chan chTerm_boxIncr1_Incrementer_finished = [MAX_PROC] of {bit};
	chan chTerm_boxIncr2_Incrementer = [MAX_PROC] of {bit};
	chan chTerm_boxIncr2_Incrementer_finished = [MAX_PROC] of {bit};
	mtype state=initial;
	
	do
		:: (state == Counter_default && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						printf("<current>Counter_default</current>\n");
						printf("<transition>Counter_T5</transition>\n");
						printf("<next>Counter_idle2</next>\n");
						printf("</firing>\n");
						state = Counter_idle2;
						LastTransition=Counter_T5;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Counter_idle2 && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						PidTemp=run Incrementer(_pid,Incrementer_byOne,P_to,chTerm_boxIncr1_Incrementer,chTerm_boxIncr1_Incrementer_finished);
						ChildrenMatrix[_pid].children[PidTemp]=1;
						HasToken[PidTemp]=1;
						PidTemp=run Incrementer(_pid,Incrementer_byTwo,P_to,chTerm_boxIncr2_Incrementer,chTerm_boxIncr2_Incrementer_finished);
						ChildrenMatrix[_pid].children[PidTemp]=1;
						HasToken[PidTemp]=1;
						printf("<current>Counter_idle2</current>\n");
						printf("<transition>Counter_T6_T7_T8</transition>\n");
						printf("<next>Counter_boxIncr1_boxIncr2</next>\n");
						printf("</firing>\n");
						state = Counter_boxIncr1_boxIncr2;
						LastTransition=Counter_T6_T7_T8;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Counter_limit && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Counter_boxIncr1_boxIncr2 && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: ((chTerm_boxIncr1_Incrementer_finished?[1]) && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						if ::(chTerm_boxIncr1_Incrementer_finished?[1]) -> chTerm_boxIncr1_Incrementer_finished?_; :: else -> skip; fi;
						chTerm_boxIncr1_Incrementer!1;
						if ::(chTerm_boxIncr2_Incrementer_finished?[1]) -> chTerm_boxIncr2_Incrementer_finished?_; :: else -> skip; fi;
						chTerm_boxIncr2_Incrementer!1;
						chTerm_limit!1;
						printf("<current>Counter_boxIncr1_boxIncr2</current>\n");
						printf("<transition>Counter_T9_T10_T11</transition>\n");
						printf("<next>Counter_limit</next>\n");
						printf("</firing>\n");
						state = Counter_limit;
						LastTransition=Counter_T9_T10_T11;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == backProp && descendantExecuted[_pid]==1 && didBackProp==0) ->
		    atomic{
				didBackProp=1;
		        descendantExecuted[parent]=1;
		    }
		
		:: (state == backProp && updateState==1)->
			atomic{
				state = nextState;
				state = backProp;
			}

	od unless {
		(chTerm?[1] ||  dyingPid[parent]==1);
		if
			::chTerm?[1] -> chTerm?1;
		fi;
		dyingPid[_pid]=1;
	}

}
proctype Incrementer(pid parent; mtype initial;int P_limit;chan chTerm;chan chTerm_finished) {

	byte i;
	pid PidTemp;

	mtype state=initial;
	
	do
		:: (state == Incrementer_byOne && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						printf("<current>Incrementer_byOne</current>\n");
						printf("<transition>Incrementer_T12</transition>\n");
						printf("<next>Incrementer_simpleIncr</next>\n");
						printf("</firing>\n");
						state = Incrementer_simpleIncr;
						LastTransition=Incrementer_T12;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Incrementer_byTwo && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						printf("<current>Incrementer_byTwo</current>\n");
						printf("<transition>Incrementer_T13</transition>\n");
						printf("<next>Incrementer_doubleIncr</next>\n");
						printf("</firing>\n");
						state = Incrementer_doubleIncr;
						LastTransition=Incrementer_T13;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Incrementer_simpleIncr && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: ((x < P_limit) && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						x=(x + 1);
						printf("<phase xsi:type=\"tesqel:Action\" order=\"0\" kind=\"assignment\" lvalue=\"x\" rvalue=\"%d\"/>\n",x);
						printf("<current>Incrementer_simpleIncr</current>\n");
						printf("<transition>Incrementer_T14</transition>\n");
						printf("<next>Incrementer_simpleIncr</next>\n");
						printf("</firing>\n");
						state = Incrementer_simpleIncr;
						LastTransition=Incrementer_T14;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: ((x >= P_limit) && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						chTerm_finished!1;
						printf("<current>Incrementer_simpleIncr</current>\n");
						printf("<transition>Incrementer_T16</transition>\n");
						printf("<next>Incrementer_finished</next>\n");
						printf("</firing>\n");
						state = Incrementer_finished;
						LastTransition=Incrementer_T16;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Incrementer_doubleIncr && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: (1 && descendantExecuted[_pid]==0) ->
						printf("<firing>\n");
						x=(x + 2);
						printf("<phase xsi:type=\"tesqel:Action\" order=\"0\" kind=\"assignment\" lvalue=\"x\" rvalue=\"%d\"/>\n",x);
						printf("<current>Incrementer_doubleIncr</current>\n");
						printf("<transition>Incrementer_T15</transition>\n");
						printf("<next>Incrementer_doubleIncr</next>\n");
						printf("</firing>\n");
						state = Incrementer_doubleIncr;
						LastTransition=Incrementer_T15;
						NoFirings=0;
						HasFired=1;
						HasExecuted[_pid]=1; 
						descendantExecuted[_pid]=1;
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == Incrementer_finished && HasToken[_pid]==1) ->
			atomic{
				HasToken[_pid]=0;
				didBackProp=0;
				if
					:: else ->
						if
							:: HasExecuted[_pid]==0 ->		//only if this proc did not execute directly in phase 1
								for (i : 0 .. MAX_PROC-1) {
									if::(ChildrenMatrix[_pid].children[i]==1)->
										HasToken[i]=1;      //pass token to children 
									::else->skip;
									fi;
								}
							::else->skip;
						fi;
				fi;
				nextState = state;
				state = backProp;
			}
		
		:: (state == backProp && descendantExecuted[_pid]==1 && didBackProp==0) ->
		    atomic{
				didBackProp=1;
		        descendantExecuted[parent]=1;
		    }
		
		:: (state == backProp && updateState==1)->
			atomic{
				state = nextState;
				state = backProp;
			}

	od unless {
		(chTerm?[1] ||  dyingPid[parent]==1);
		if
			::chTerm?[1] -> chTerm?1;
		fi;
		dyingPid[_pid]=1;
	}

}

active proctype Engine() {

	pid PidMain;
	byte i;

	//Temp Variables
	mtype temp;
	mtype temp_signal_1;
	chan chTerm_Main = [MAX_PROC] of {bit};
	chan chTerm_Main_interrupted = [MAX_PROC] of {bit};
	chan chTerm_Main_stopped = [MAX_PROC] of {bit};
	PidMain = run Main(_pid,Main_initial,	chTerm_Main,chTerm_Main_interrupted,chTerm_Main_stopped);
ChildrenMatrix[_pid].children[PidMain]=1;

	//Generation of first messages
signal!0,0;

	printf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
	printf("<tesqel:TestSequence xmlns:tesqel=\"tesqel\">\n");
	printf("<initial>Main_initial</initial>\n");

	nextStep:
		atomic {
		//MESSAGES ON signal
		if
		:: (len(signal)==1) ->
			if
			:: (1) ->
				if
				:: temp_signal_1=msg;
				fi;
				printf("<IOmessage channel=\"signal[%d]\" message=\"&lt;%e>\"/>\n",signal,temp_signal_1);
				signal!1,temp_signal_1;
			:: (1) ->
				signal!0,0;
			fi;
		:: else ->
			printf("<IOmessage channel=\"signal\" direction=\"fromSystem\"/>\n");
		fi;
		signal?temp,temp_signal_1;

			updateState=0
			HasFired=0;
			isFirstDescent=1;
			for (i : 0 .. MAX_PROC-1){
				HasExecuted[i]=0;
				descendantExecuted[i]=0;
				HasToken[i] = ChildrenMatrix[_pid].children[i];
			}
			printf("\n\n<compoundFiring>\n\n");
		}
		goto waitTimeout;
		
	nextPhase: //a phase includes phase1 (descent) and phase2 (backprop)
		atomic {
		updateState=0;
		HasFired=0;
		for ( i : 0 .. MAX_PROC - 1){
				// give token to engine's children
				HasToken[i] = ChildrenMatrix[_pid].children[i];
			}
		isFirstDescent = 0; //It's at least the second
	}
		goto waitTimeout;

	waitTimeout:
		do
			:: timeout -> //deadlock
				if
					:: (HasFired==0 && isFirstDescent==1) -> goto abort;
					:: (HasFired==0 && isFirstDescent==0 && updateState==0) -> 
						atomic{
						updateState=1;
							//goto nextStep;
					}
				:: (HasFired==0 && isFirstDescent==0 && updateState==1) -> 
					atomic{
				printf("\n\n</compoundFiring>\n\n");
							goto nextStep;
						}
					:: (HasFired==1 && updateState==0) -> updateState=1;
					:: (HasFired==1 && updateState==1) -> goto nextPhase;
				fi;
		od;

	abort:
		atomic {
			dyingPid[_pid]=1;
		}
}
