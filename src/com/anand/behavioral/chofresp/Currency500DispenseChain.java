package com.anand.behavioral.chofresp;

public class Currency500DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDisplenseChain) {
		this.moneyDispenseChain = moneyDisplenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=500) {
			int noOfNotes = currency.getAmount()/500;
			int reminder = currency.getAmount()%500;
			System.out.println("Dispensing "+noOfNotes+" of Rs 500");
			if(reminder!=0) {
				moneyDispenseChain.dispense(new Currency(reminder));
			}
			
		}else {
			moneyDispenseChain.dispense(currency);
		}
	}

}
