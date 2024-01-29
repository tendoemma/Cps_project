package cps.nodes;

import cps.interfaces.ICont;
import cps.interfaces.IDirs;

public class DCont extends Cont implements ICont {
	public DCont(IDirs dirs, int nbMaxSauts) {
		super();
		this.dirs = dirs;
		this.nbMaxSauts = nbMaxSauts;
	}
	private IDirs dirs ;
	private int nbMaxSauts;


}
