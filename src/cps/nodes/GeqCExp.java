package cps.nodes;

import cps.interfaces.ICExp;
import cps.interfaces.IRand;

public class GeqCExp extends CExp implements ICExp {
	public GeqCExp(IRand rand1, IRand rand2) {
		super();
		this.rand1 = rand1;
		this.rand2 = rand2;
	}

	private IRand rand1, rand2;

}
