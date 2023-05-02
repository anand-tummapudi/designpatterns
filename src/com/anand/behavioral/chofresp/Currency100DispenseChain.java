package com.anand.behavioral.chofresp;

public class Currency100DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDisplenseChain) {
		this.moneyDispenseChain = moneyDisplenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=100) {
			int noOfNotes = currency.getAmount()/100;
			int reminder = currency.getAmount()%100;
			System.out.println("Dispensing "+noOfNotes+" of Rs 100");
			if(reminder!=0) {
				moneyDispenseChain.dispense(new Currency(reminder));
			}
			
		}else {
			moneyDispenseChain.dispense(currency);
		}
	}

}
