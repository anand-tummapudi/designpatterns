package com.anand.behavioral.mediator;

public abstract class User {
	private ChattingMediator chattingMediator;
	private String userName;
	
	public User(ChattingMediator chattingMediator, String userName){
		super();
		this.chattingMediator = chattingMediator;
		this.userName = userName;
	}

	public ChattingMediator getChattingMediator() {
		return chattingMediator;
	}

	public String getUserName() {
		return userName;
	}
	
	public abstract void sendMesssage(String message);
	public abstract void receiveMesssage(String message);
	
	
}
