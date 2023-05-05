package com.anand.behavioral.observer;

public class ObserverClient {

	public static void main(String[] args) {

		FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdMessageSubscriber = new ThirdMessageSubscriber();
		
		MessagePublisher messagePublisher = new MessagePublisher();
		
		messagePublisher.register(firstMessageSubscriber);
		messagePublisher.register(secondMessageSubscriber);
		
		messagePublisher.notifyUpdate(new Message("This is first Message"));
		System.out.println("#################");
		messagePublisher.unregister(firstMessageSubscriber);
		messagePublisher.register(thirdMessageSubscriber);
		
		messagePublisher.notifyUpdate(new Message("This is second Message"));
		
	}

}
