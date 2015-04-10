package com.designpatterns.observer;

public class NewspaperBoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newspaper newYorkTimes = new NewYorkTimes();
		
		Subscriber personalSubscriber = new NewspaperSubscriber1("Mary", "Phillip");
		personalSubscriber.subscribe(newYorkTimes);
		
		Subscriber corporateSubscriber = new NewspaperSubscriber2("Kripton Games");
		corporateSubscriber.subscribe(newYorkTimes);
		
		// Send newspapers
		System.out.println("\nSending newspapers...");
		newYorkTimes.sendNewspaper();
		
		// Cancel corporate subscription
		corporateSubscriber.cancelSubscription();
		
		// Resend newspapers
		System.out.println("\nSending newspapers...");
		newYorkTimes.sendNewspaper();
	}

}
