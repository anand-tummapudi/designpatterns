package com.anand.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
		/*
		 * ExecutorService executorService = null; MyThread myThread = new MyThread();
		 * 
		 * try{ executorService = Executors.newFixedThreadPool(5);
		 * executorService.execute(myThread); executorService.execute(myThread);
		 * executorService.execute(myThread); executorService.execute(myThread);
		 * executorService.execute(myThread); executorService.execute(myThread);
		 * executorService.execute(myThread); executorService.execute(myThread);
		 * executorService.execute(myThread);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }finally {
		 * 
		 * }
		 */
		
		// Using Reflection API to break singleton
		
		 Singleton obj1 = Singleton.getInstance(); 
		 Singleton obj2 = null;
		 
		 Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
		 
		 for(Constructor<?> constructor:constructors) {
			 constructor.setAccessible(true);
			 
			 try {
				Object object = constructor.newInstance();
				obj2 = (Singleton)object;
				break;
				
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 System.out.println(obj1.hashCode());
		 System.out.println(obj2.hashCode());
		
		
	}

}
