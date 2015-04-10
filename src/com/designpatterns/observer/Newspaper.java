package com.designpatterns.observer;

public interface Newspaper {
	void addSubscriber(Subscriber subscriber);
	void removeSubscriber(Subscriber subscriber);
	void sendNewspaper();
}
