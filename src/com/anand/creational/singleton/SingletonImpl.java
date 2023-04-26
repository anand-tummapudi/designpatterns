package com.anand.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

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
		
		/*
		 * Singleton obj1 = Singleton.getInstance(); Singleton obj2 = null;
		 * 
		 * Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
		 * 
		 * for(Constructor<?> constructor:constructors) {
		 * constructor.setAccessible(true);
		 * 
		 * try { Object object = constructor.newInstance(); obj2 = (Singleton)object;
		 * break;
		 * 
		 * } catch (InstantiationException | IllegalAccessException |
		 * IllegalArgumentException | InvocationTargetException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } }
		 * 
		 * System.out.println(obj1.hashCode()); System.out.println(obj2.hashCode());
		 */ 
		 
		// Using Serialization
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = null;
		
		ObjectOutput objectOutput = null;
		try {
			objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			objectOutput.writeObject(obj1);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			objectOutput.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		ObjectInput objectInput = null;
		
		try {
			objectInput = new ObjectInputStream(new FileInputStream("singleton.ser"));
			Object obj = objectInput.readObject();
			obj2 = (Singleton)obj;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				objectInput.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
