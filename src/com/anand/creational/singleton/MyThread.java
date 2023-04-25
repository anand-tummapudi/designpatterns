package com.anand.creational.singleton;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton songleton = Singleton.getInstance();
		
		System.out.println(Thread.currentThread().getName()+"--"+songleton.hashCode());
	}

}
