package com.Source;

public	class databaseSourceFactory extends AbstractSourceFactory {
	public  AbstractSource getSourceFactory() {
		return new databaseSource();
	}
}
