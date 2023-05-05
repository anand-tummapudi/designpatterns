package com.anand.behavioral.observer;

public interface Subject {
	
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyUpdate(Message message);

}
