package com.main;

import com.Source.AbstractSource;
import com.Source.AbstractSourceFactory;
import com.Source.XMLSource;

public class creat {
	public static void main(String[] args) {
		AbstractSourceFactory factory =(AbstractSourceFactory)XMLSource.getBean();
		AbstractSource source = factory.getSourceFactory();
		source.Source();
	}
	
}
