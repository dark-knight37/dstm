package org.xtext.unina.xdstmdata.validation;

import org.xtext.unina.xdstmdata.xDstmdata.tCompound;
import org.xtext.unina.xdstmdata.xDstmdata.tEnum;
import org.xtext.unina.xdstmdata.xDstmdata.tMultitype;
import org.xtext.unina.xdstmdata.xDstmdata.tTypes;

public class Helper {

	public static boolean isEnum(tTypes model, String idType) {
		for (tEnum type : model.getTEnum()) {
			if (type.getName().compareTo(idType)==0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isCompound(tTypes model, String idType) {
		for (tCompound type : model.getTCompound()) {
			if (type.getName().compareTo(idType)==0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isMultitype(tTypes model, String idType) {
		for (tMultitype type : model.getTMultitype()) {
			if (type.getName().compareTo(idType)==0) {
				return true;
			}
		}
		return false;
	}

}
