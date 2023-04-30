package com.anand.structural.flyweight;

public class Developer implements Employee {
	
	private final String job;
	private String skill;
	
	public Developer(){
		job = "Perform Development";
	}

	@Override
	public void assignSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void performTask() {
		System.out.println("Developer with the skill: "+job);
	}

}
