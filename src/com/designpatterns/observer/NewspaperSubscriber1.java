package com.designpatterns.observer;

public class NewspaperSubscriber1 implements Subscriber{

	private Newspaper newspaper;
	
	private String firstName;
	
	private String lastName;
	
	public NewspaperSubscriber1(String fname, String lname) {
		// TODO Auto-generated constructor stub
		setFirstName(fname);
		setLastName(lname);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Newspaper send to personal account: " + getFirstName() + " " + getLastName());
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
		System.out.println("Person: " + getFirstName() + " " + getLastName() + " subscribed to newspaper");
	}

	public Newspaper getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(Newspaper newspaper) {
		this.newspaper = newspaper;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
