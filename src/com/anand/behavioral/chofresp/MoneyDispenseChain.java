package com.anand.behavioral.chofresp;

public interface MoneyDispenseChain {
	
	public void setNextChain(MoneyDispenseChain moneyDisplenseChain);
	public void dispense(Currency currency);

}
