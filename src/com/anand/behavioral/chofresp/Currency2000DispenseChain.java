package com.anand.behavioral.chofresp;

public class Currency2000DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDisplenseChain) {
		this.moneyDispenseChain = moneyDisplenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=2000) {
			int noOfNotes = currency.getAmount()/2000;
			int reminder = currency.getAmount()%2000;
			System.out.println("Dispensing "+noOfNotes+" of Rs 2000");
			if(reminder!=0) {
				moneyDispenseChain.dispense(new Currency(reminder));
			}
			
		}else {
			moneyDispenseChain.dispense(currency);
		}
	}

}
