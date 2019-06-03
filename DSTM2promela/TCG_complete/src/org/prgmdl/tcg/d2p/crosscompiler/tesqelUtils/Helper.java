package org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils;

public abstract class Helper {
	
	protected String kind;
	
	protected final String hide = "//";
	
	protected final String show = "";

	protected final String space = " ";
	
	protected final String quotes = "\"";
	
	protected final String slash = "\\";
	
	protected final String msgStart = "";
	
	protected final String msgEnd = "";

	public String tesqelHeader() {
		String retval = "<phase xsi:type=" + this.pq() + "tesqel:" + this.kind + this.pq();
		retval += " order=" + this.pq() + OrderGenerator.get() + this.pq();
		return retval;
    }
	
	public String printfHeader() {
		return "printf(" + this.quotes;
	}
	
	public String printfTrailer() {
		return ")";
	} 

	public String tesqelTrailer() {
		return "/>";
	} 

	public String getChannelContent(String chname) {
		String retval = chname + "[_]";
		retval = this.whenChannelIsNotEmpty(chname,retval);
		return retval;
	}

	public String whenChannelIsFull(String chname, String payload) {
        return this.whenChannelIs(chname,payload,"full");
	}

	public String whenChannelIsEmpty(String chname, String payload) {
        return this.whenChannelIs(chname,payload,"empty");
	}

	public String whenChannelIsNotEmpty(String chname, String payload) {
        return this.whenChannelIs(chname,payload,"nempty");
	}
	
	public String whenChannelIs(String chname, String payload, String condition) {
        return ":: atomic {(" + condition + "(" + chname + ")) -> " + payload + ";}";
	}

    public String getChannelFormalName(String p) {
    	int ui = p.indexOf("_");
    	String retval = (ui>0) ? p.substring(0,ui) : p;
    	return retval;
    }
	
	public String pq() {
		return this.slash + this.quotes;
	} 

	public String q() {
		return this.quotes;
	} 
	
	protected String sn() {
		return "\\n";
	}
}
