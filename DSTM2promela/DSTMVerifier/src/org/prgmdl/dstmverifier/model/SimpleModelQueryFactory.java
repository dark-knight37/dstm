package org.prgmdl.dstmverifier.model;

import DSTM4Rail.DSTM;

public class SimpleModelQueryFactory {

	public static SimpleModelQuery factory(DSTM model) {
		return new SimpleModelQuery(model);
	}
}
