package com.Source;


public	class textSourceFactory extends AbstractSourceFactory {
	public  AbstractSource getSourceFactory() {
		return new textSource();
	}
}
