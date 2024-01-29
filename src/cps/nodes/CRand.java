package cps.nodes;

import cps.interfaces.IRand;

public class CRand extends Rand implements IRand {
	public CRand(double sensorValue) {
		super();
		this.sensorValue = sensorValue;
	}

	private double sensorValue;
}
