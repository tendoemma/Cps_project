package cps.nodes;

import cps.interfaces.IGather;

public class RGather extends Gather implements IGather {
	

	public RGather(int id, IGather gather) {
		super();
		this.id = id;
		this.gather = gather;
	}
	private final int id; 
	private final IGather gather; 

}
