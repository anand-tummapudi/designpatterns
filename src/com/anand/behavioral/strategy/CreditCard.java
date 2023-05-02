package com.anand.behavioral.strategy;

public class CreditCard implements PaymentMethod {

	private String caraNumber;
	private String cardHolderName;
	private String cvv;
	private String expiryDate;
	
	
	public CreditCard(String caraNumber, String cardHolderName, String cvv, String expiryDate) {
		super();
		this.caraNumber = caraNumber;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	 
	public String getCaraNumber() {
		return caraNumber;
	}


	public String getCardHolderName() {
		return cardHolderName;
	}


	public String getCvv() {
		return cvv;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	@Override
	public void pay(double amount) {
		System.out.println("Making payment using Credit Card:"+Math.round(amount));
	}

}
