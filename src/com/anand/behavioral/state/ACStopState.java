package com.anand.behavioral.state;

public class ACStopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned Off");		
	}

}
