package cps.nodes;

import cps.interfaces.IBExp;

public class SBExp extends BExp implements IBExp {
	public SBExp(String id) {
		super();
		this.id = id;
	}

	private String id;
}
