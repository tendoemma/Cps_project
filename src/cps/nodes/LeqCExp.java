package cps.nodes;

import cps.interfaces.ICExp;
import cps.interfaces.IRand;

public class LeqCExp extends CExp implements ICExp {
	public LeqCExp(IRand rand1, IRand rand2) {
		super();
		this.rand1 = rand1;
		this.rand2 = rand2;
	}

	private IRand rand1, rand2;

}
