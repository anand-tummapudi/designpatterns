package com.anand.structural.flyweight;

import java.util.HashMap;

public class EmployeeFactory {
	
	private static HashMap<String,Employee> map = new HashMap<>();
	
	public static Employee getEmployee(String type) {
		Employee emp = null;
		
		if(map.get(type)!=null) {
			emp = map.get(type);
		}else {
			switch(type) {
			case "Developer":
				emp = new Developer();
				System.out.println("Developer Created...");
				break;
			case "Tester":
				emp = new Tester();
				System.out.println("Tester Created...");
				break;
			default: 
				System.out.println("No such Employee");
			}
			
			map.put(type, emp);
		}
		
		
	return emp;
	}

}
