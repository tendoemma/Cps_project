package cps.nodes;

import cps.interfaces.IRand;

public class SRand extends Rand implements IRand {
	public SRand(String id) {
		super();
		this.id = id;
	}

	private String id;
	
}
