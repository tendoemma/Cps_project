package cps.nodes;

import cps.interfaces.ICExp;
import cps.interfaces.IRand;

public class EqCExp extends CExp implements ICExp {
	public EqCExp(IRand rand1, IRand rand2) {
		super();
		this.rand1 = rand1;
		this.rand2 = rand2;
	}

	private IRand rand1, rand2;
}
