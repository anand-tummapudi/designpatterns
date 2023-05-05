package com.anand.behavioral.observer;

public class ThirdMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for third subscriber:"+message.getMessage());
	}

}
