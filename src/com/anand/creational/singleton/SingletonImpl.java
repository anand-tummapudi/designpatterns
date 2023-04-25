package com.anand.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Singleton obj1 = Singleton.getInstance(); Singleton obj2 =
		 * Singleton.getInstance();
		 * 
		 * System.out.println(obj1.hashCode()); System.out.println(obj2.hashCode());
		 */
		
		ExecutorService executorService = null;
		MyThread myThread = new MyThread();
		
		try{
			executorService = Executors.newFixedThreadPool(5);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
