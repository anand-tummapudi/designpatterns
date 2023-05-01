package com.anand.behavioral.mediator;

public interface ChattingMediator {
	public void sendMessage(String message, User user);
	public void addUser(User user);
	
}
