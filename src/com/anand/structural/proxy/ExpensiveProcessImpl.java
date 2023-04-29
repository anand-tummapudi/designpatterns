package com.anand.structural.proxy;

public class ExpensiveProcessImpl implements ExpensiveProcess{
	
	public ExpensiveProcessImpl() {
		initialConfigurationSetup();
	}

	@Override
	public void process() {
		System.out.println("Processing is done.");
		
	}
	
	private void initialConfigurationSetup() {
		System.out.println("Setting up initial Configuration...");
	}
	
	

}
