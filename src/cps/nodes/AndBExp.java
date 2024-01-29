package cps.nodes;

import cps.interfaces.IBExp;

public class AndBExp extends BExp implements IBExp {
	public AndBExp(IBExp bexp1, IBExp bexp2) {
		super();
		this.bexp1 = bexp1;
		this.bexp2 = bexp2;
	}

	private IBExp bexp1, bexp2;
	
}
