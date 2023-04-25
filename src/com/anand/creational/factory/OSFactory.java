package com.anand.creational.factory;

public class OSFactory {
	
	public OS getOs(String type) {
		if(type.equals("ios")) {
			return new Ios();
		}else if(type.equals("android")) {
			return new Android();
		}else return new Windows();
	}

}
