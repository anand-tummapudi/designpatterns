package com.anand.behavioral.mediator;

public class MediatorClient {
	
	public static void main(String args[]) {
		ChattingMediator chattingMediator = new ChattingMediatorImpl();
		User user1 = new UserImpl(chattingMediator,"Anand");
		User user2 = new UserImpl(chattingMediator,"Ravi");
		User user3 = new UserImpl(chattingMediator,"Swapna");
		User user4 = new UserImpl(chattingMediator,"Kavya");
		User user5 = new UserImpl(chattingMediator,"Latha");
		
		chattingMediator.addUser(user1);
		chattingMediator.addUser(user2);
		chattingMediator.addUser(user3);
		chattingMediator.addUser(user4);
		chattingMediator.addUser(user5);
		
		user2.sendMesssage("Hi All");
		
	}
}
