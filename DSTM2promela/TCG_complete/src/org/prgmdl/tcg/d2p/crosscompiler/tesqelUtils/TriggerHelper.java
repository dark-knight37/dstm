package org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils;

public class TriggerHelper extends Helper {
	
	public TriggerHelper() {
		this.kind = "Trigger";
    }
	
    public String getMessage(String chname) {
        String phase = this.show; 
        phase += this.printfHeader() + this.tesqelHeader() + this.space;
        phase += "channel=" + this.pq() + this.getChannelFormalName(chname) + this.pq() + this.space;
        phase += "message=" + this.pq() + this.msgStart + "%d" + this.msgEnd + this.pq();
        phase += this.tesqelTrailer() + this.sn() + this.q(); 
        phase += "," + chname + this.printfTrailer();
		return phase;
    }
}