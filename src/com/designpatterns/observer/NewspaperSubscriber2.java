package com.designpatterns.observer;

public class NewspaperSubscriber2 implements Subscriber {

private Newspaper newspaper;
	
	private String corporationName;
	
	public NewspaperSubscriber2(String name) {
		// TODO Auto-generated constructor stub
		setCorporationName(name);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Newspaper send to corporate account: " + getCorporationName());
	}

	@Override
	public void cancelSubscription() {
		// TODO Auto-generated method stub
		getNewspaper().removeSubscriber(this);
	}

	@Override
	public void subscribe(Newspaper newspaper) {
		// TODO Auto-generated method stub
		setNewspaper(newspaper);
		getNewspaper().addSubscriber(this);
		System.out.println("Corporation: " + getCorporationName() + " subscribed to newspaper");
	}

	public Newspaper getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(Newspaper newspaper) {
		this.newspaper = newspaper;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

}
