package cps.nodes;

import cps.interfaces.IBase;
import cps.interfaces.ICont;

public class FCont extends Cont implements ICont {
	public FCont(double distanceMax, IBase base) {
		super();
		this.distanceMax = distanceMax;
		this.base = base;
	}
	private double distanceMax;
	private IBase base;
	
}
