package cps.nodes;

import cps.interfaces.ICExp;

public class CExpBExp extends BExp implements ICExp {
	public CExpBExp(ICExp cexp) {
		super();
		this.cexp = cexp;
	}

	private ICExp cexp;
}
