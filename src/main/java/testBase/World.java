package testBase;

import java.io.IOException;

import pages.PageObjectManager;

public class World {
	
	public Testbase tb;
	public PageObjectManager po;
	
	public World() throws IOException {
		tb=new Testbase();
		po=new PageObjectManager(tb.launchDriver());
	}

}
