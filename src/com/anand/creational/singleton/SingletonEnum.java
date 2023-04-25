package com.anand.creational.singleton;

public enum SingletonEnum {
	GETINSTANCE;
	
	public String welcome() {
		return "Singleton";
	}
	
	public static void main(String args[]) {
		SingletonEnum s1 = SingletonEnum.GETINSTANCE;
		SingletonEnum s2 = SingletonEnum.GETINSTANCE;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.welcome());
		System.out.println(s2.welcome());
	}
}
