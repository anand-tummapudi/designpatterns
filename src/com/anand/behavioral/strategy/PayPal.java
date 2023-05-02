package com.anand.behavioral.strategy;

public class PayPal implements PaymentMethod {
	
	private String email;
	private String password;
	
	
	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public PayPal(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	@Override
	public void pay(double amount) {
		System.out.println("Payment using Paypal Account:"+Math.round(amount));
	}

}
