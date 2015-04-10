package com.designpatterns.observer;

public interface Subscriber {
	void update();
	void cancelSubscription();
	void subscribe(Newspaper newspaper);
}
