package org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils;

public class ConditionHelper extends Helper {
	
	public ConditionHelper() {
		this.kind = "Condition";
    }
	
    public String getVarValue(String varname) {
        String phase = this.show;
        phase += this.printfHeader() + this.tesqelHeader() + this.space;
        phase += "kind=" + this.pq() + "variable" + this.pq() + this.space;
        phase += "lvalue="  + this.pq() + varname + this.pq() + this.space;
        phase += "rvalue=" + this.pq() + "%d" + this.pq();
        phase += this.tesqelTrailer() + "," + varname;
        phase += super.sn() + super.q() + super.printfTrailer();
		return phase;
    }
    
    public String getIsFullEmptyNempty(String chname) {
    	String formalName = this.getChannelFormalName(chname);
        String phaseF = this.show;
        phaseF += this.printfHeader() + this.tesqelHeader() + this.space;
        phaseF += "kind=" + this.pq() + "isFull" + this.pq() + this.space;
        phaseF += "lvalue=" + this.pq() + formalName + this.pq();
        phaseF += super.tesqelTrailer() + super.sn() + super.q() + super.printfTrailer();

        String phaseE = this.show; 
        phaseE += this.printfHeader() + this.tesqelHeader() + this.space;
        phaseE += "kind=" + this.pq() + "isEmpty" + this.pq() + this.space;
        phaseE += "lvalue=" + this.pq() + formalName + this.pq();
        phaseE += super.tesqelTrailer() + super.sn() + super.q() + super.printfTrailer();

        String phaseNE = this.show; 
        phaseNE += this.printfHeader() + this.tesqelHeader() + this.space;
        phaseNE += "kind=" + this.pq() + "message" + this.pq() + this.space;
        phaseNE += "lvalue=" + this.pq() + formalName + this.pq() + this.space;
        phaseNE += "rvalue=" + this.pq() + "%d" + this.pq();
        phaseNE += this.tesqelTrailer() + this.sn() + this.q(); 
        phaseNE += "," + chname + this.printfTrailer();

        String phase = this.show;
        phase = "if";
        phase += this.space + super.whenChannelIsFull(chname,phaseF);
        phase += this.space + super.whenChannelIsEmpty(chname,phaseE);
        phase += this.space + ":: atomic {else -> skip;} fi; ";
        phase += "if";
        phase += this.space + super.whenChannelIsNotEmpty(chname,phaseNE);
        phase += this.space + ":: atomic {else -> skip;} fi;";
		return phase;
    }
} 