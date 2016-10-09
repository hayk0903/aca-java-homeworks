package edu.zoo.booth.classes;

public class Ticket {
	

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Ticket [price=" + price + "]";
	}
	
}
