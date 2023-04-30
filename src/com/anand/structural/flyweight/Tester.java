package com.anand.structural.flyweight;

public class Tester implements Employee {
	
	private final String job;
	private String skill;
	
	public Tester(){
		job = "Testing functionality";
	}

	@Override
	public void assignSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void performTask() {
		System.out.println("Tester with skill "+this.skill+" with job "+job);
	}

}
