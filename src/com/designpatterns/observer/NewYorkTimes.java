package com.designpatterns.observer;

import java.util.ArrayList;

public class NewYorkTimes implements Newspaper {
	
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

	@Override
	public void addSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		getSubscribers().add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		getSubscribers().remove(subscriber);
	}

	@Override
	public void sendNewspaper() {
		// TODO Auto-generated method stub
		for(int i = 0; i < getSubscribers().size(); i++){
			getSubscribers().get(i).update();
		}
	}

	public ArrayList<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(ArrayList<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

}
