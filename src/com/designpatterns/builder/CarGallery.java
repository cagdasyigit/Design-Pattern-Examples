package com.designpatterns.builder;

public class CarGallery {

	public static void main(String[] args) {
		OrderManager ob = new OrderManager();
		Car A5 = ob.createOrder("Audi", "A5", "Gray", 320);
		Car TT = ob.createOrder("Audi", "TT", "Blood Red", 260);
		Car R8 = ob.createOrder("Audi", "R8", "Sun", 350);
		Car GT = ob.createOrder("Ford", "GT", "Cherry", 330);
		Car MG = ob.createOrder("Ford", "Mustang GT", "Black", 280);
		
		System.out.println("Ordered Cars: ");
		System.out.println(A5.ToString());
		System.out.println(TT.ToString());
		System.out.println(R8.ToString());
		System.out.println(GT.ToString());
		System.out.println(MG.ToString());
	}

}
