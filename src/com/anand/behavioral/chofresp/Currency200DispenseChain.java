package com.anand.behavioral.chofresp;

public class Currency200DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDisplenseChain) {
		this.moneyDispenseChain = moneyDisplenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=200) {
			int noOfNotes = currency.getAmount()/200;
			int reminder = currency.getAmount()%200;
			System.out.println("Dispensing "+noOfNotes+" of Rs 200");
			if(reminder!=0) {
				moneyDispenseChain.dispense(new Currency(reminder));
			}
			
		}else {
			moneyDispenseChain.dispense(currency);
		}
	}

}
