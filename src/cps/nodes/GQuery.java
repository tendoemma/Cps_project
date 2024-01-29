package cps.nodes;

import cps.interfaces.ICont;
import cps.interfaces.IGather;
import cps.interfaces.IQuery;

public class GQuery extends Query implements IQuery {
	public GQuery(IGather gather, ICont cont) {
		super();
		this.gather = gather;
		this.cont = cont;
	}
	private IGather gather;
	private ICont cont;
	



}
