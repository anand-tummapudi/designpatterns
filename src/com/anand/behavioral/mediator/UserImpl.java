package com.anand.behavioral.mediator;

public class UserImpl extends User {

	private ChattingMediator chattingMediator;
	private String userName;

	public UserImpl(ChattingMediator chattingMediator, String userName) {
		super(chattingMediator, userName);
		this.chattingMediator = chattingMediator;
		this.userName = userName;
	}

	@Override
	public void sendMesssage(String message) {
		System.out.println(userName+" ..Sending message:"+message);
		chattingMediator.sendMessage(message, this);
	}

	@Override
	public void receiveMesssage(String message) {
		System.out.println(userName+" recived Message:"+message);
	}

}
