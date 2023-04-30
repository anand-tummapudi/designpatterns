package com.anand.structural.flyweight;

import java.util.Random;

public class Engineering {
	private static String []employeeType= {"Developer","Tester"};
	private static String []skills = {"Java","DotNet","C++","Python","SAP"};
	
	public static String getRandomEmployee() {
		Random r = new Random();
		int randInt = r.nextInt(employeeType.length);
		return employeeType[randInt];
	}
	
	public static String getRandomSkill() {
		Random r = new Random();
		int randInt = r.nextInt(skills.length);
		return skills[randInt];
	}
	
	public static void main(String args[]) {
		for(int i=0;i<10;i++) {
			Employee emp = EmployeeFactory.getEmployee(getRandomEmployee());
			emp.assignSkill(getRandomSkill());
			emp.performTask();
		}
	}

}
