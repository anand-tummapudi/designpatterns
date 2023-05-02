package com.anand.behavioral.chofresp;

public class ATMMachine {
	
	private MoneyDispenseChain moneyDispenseChain;
	
	public ATMMachine(){
		moneyDispenseChain = new Currency2000DispenseChain();
		MoneyDispenseChain moneyDispenseChain2 = new Currency500DispenseChain();
		MoneyDispenseChain moneyDispenseChain3 = new Currency200DispenseChain();
		MoneyDispenseChain moneyDispenseChain4 = new Currency100DispenseChain();
		
		
	}

}
