package com.anand.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	//private static final Singleton objInstance = new Singleton();
	/* 
	 * This Above is eager initialization and it occurs even if the class doesn't use the object 
	   as this instantiation will be created at the time of class loading it self. 
	   So we go with a static block for instantiation. 
	   Both the approaches are same, but when we have a static block, we will have an opportunity to handle exception.
	   So we will go with Lazy Initialization. 
	*/ 
	private static Singleton objInstance = null;
	private Singleton() {
		
	}
	
	// Commenting this to go with Lazy Initialization which will go within get Instance method.
	/*
	 * static { try { if(objInstance==null) { objInstance = new Singleton(); }
	 * }catch(Exception e) { e.printStackTrace(); } }
	 */
	
	// Below one will work fine in Single environment and this will break in case of multi threaded environment.
	
	/*
	 * public static Singleton getInstance() {
	 * 
	 * try { if(objInstance==null) { objInstance = new Singleton(); }
	 * }catch(Exception e) { e.printStackTrace(); } return objInstance; }
	 */
	
	/* Creating Thread Safe Singleton
	 * We need to synchronize the method
	 * If we make entire method synchronized, performance of this method will decrease
	 * So we will use synchronized block with double checking mechanism
	 * 
	 */
	
	public static Singleton getInstance() {
		  
		 if(objInstance==null) {
			synchronized (Singleton.class) {
				if(objInstance==null) {
					try {
						objInstance = new Singleton();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			} 
		 }
		  return objInstance; 
	 }
	
	private Object readResolve() {
		return getInstance();
	}
}
