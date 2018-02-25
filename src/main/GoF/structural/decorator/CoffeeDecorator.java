package main.GoF.structural.decorator;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class CoffeeDecorator implements Coffee {

	private final Coffee decoratedCoffee;

	CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
}
