package com.anand.structural.proxy;

public class ExpensiveProcessProxy implements ExpensiveProcess{
	
	private static ExpensiveProcess expensiveProcessObj;
	
	@Override
	public void process() {
		if(expensiveProcessObj==null) {
			expensiveProcessObj = new ExpensiveProcessImpl();
		}
		
		expensiveProcessObj.process();
		
	}

}
