package cps.nodes;

import cps.interfaces.IBExp;
import cps.interfaces.ICont;
import cps.interfaces.IQuery;

public class BQuery extends Query implements IQuery {
	public BQuery(IBExp bexp, ICont cont) {
		super();
		this.bexp = bexp;
		this.cont = cont;
	}
	private IBExp bexp;
	private ICont cont;
}
