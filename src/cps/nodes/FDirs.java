package cps.nodes;

import cps.interfaces.IDir;
import cps.interfaces.IDirs;

public class FDirs extends Dirs implements IDirs {
	
	public FDirs(IDir dir) {
		super();
		this.dir = dir;
	}

	private IDir dir;
}
