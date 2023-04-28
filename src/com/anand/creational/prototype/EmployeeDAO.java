package com.anand.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements Cloneable{
	
	private static List<Employee> empList;
	
	static {
		empList = new ArrayList<>();
		
		Employee emp1 = new Employee();
		
		emp1.setEmployeeId("E1");
		emp1.setEmpoyeeName("Employee1");
		emp1.setEmployeeSalary(25000);
		
		Employee emp2 = new Employee();
		
		emp2.setEmployeeId("E2");
		emp2.setEmpoyeeName("Employee2");
		emp2.setEmployeeSalary(50000);
		
	}
	
	public List<Employee> getEmployees(){
		return empList;
	}
	
	protected List<Employee> clone() throws CloneNotSupportedException{
		List<Employee> cloneEmpList = new ArrayList<>();
		for(Employee emp:empList) {
			cloneEmpList.add(emp);
		}
		return cloneEmpList;
	}

}
