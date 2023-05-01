package com.anand.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChattingMediatorImpl implements ChattingMediator {
	
	private List<User> userList;
	
	public ChattingMediatorImpl() {
		userList = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User user1:userList) {
			if(!user1.getUserName().equals(user.getUserName())) {
				user1.receiveMesssage(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}
