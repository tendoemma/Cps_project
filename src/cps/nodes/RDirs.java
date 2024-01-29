package cps.nodes;

import cps.interfaces.IDir;
import cps.interfaces.IDirs;

public class RDirs extends Dirs implements IDirs {
	public RDirs(IDir dir, IDirs dirs) {
		super();
		this.dir = dir;
		this.dirs = dirs;
	}
	private IDir dir;
	private IDirs dirs;
	
}
