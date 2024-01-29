package cps.nodes;

import cps.interfaces.IDir;

enum directions {
		
	NW, NE, SE, SW
}

public class Dir implements IDir {
	public Dir(directions dir) {
		super();
		this.dir = dir;
	}

	private directions dir;

}
