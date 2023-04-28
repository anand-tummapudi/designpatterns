package com.anand.creational.prototype;

public class Employee {
	
	private String employeeId;
	private String empoyeeName;
	private double employeeSalary;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpoyeeName() {
		return empoyeeName;
	}
	public void setEmpoyeeName(String empoyeeName) {
		this.empoyeeName = empoyeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empoyeeName=" + empoyeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	

}
