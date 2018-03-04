package main.GoF.behavioral.strategy;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class Customer {

	private Strategy strategy;
	private double bill;

	public Customer(final Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(final Strategy strategy) {
		this.strategy = strategy;
	}

	public void buyIt(final double price, final int quantity) {
		bill += this.strategy.getPrice(price) * quantity;
	}

	public double getBill() {
		return bill;
	}
}
