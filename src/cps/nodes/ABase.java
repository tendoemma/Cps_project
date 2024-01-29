package cps.nodes;

import cps.interfaces.IBase;
import cps.types.Position;

public class ABase extends Base implements IBase {
	public ABase(Position position) {
		super();
		this.position = position;
	}

	private Position position;
}
