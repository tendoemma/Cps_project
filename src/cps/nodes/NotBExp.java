package cps.nodes;

import cps.interfaces.IBExp;

public class NotBExp extends BExp implements IBExp {
	public NotBExp(IBExp bexp) {
		super();
		this.bexp = bexp;
	}

	private IBExp bexp;

}
