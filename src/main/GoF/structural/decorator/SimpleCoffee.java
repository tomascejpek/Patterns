package main.GoF.structural.decorator;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class SimpleCoffee implements Coffee {

	@Override
	public double getCost() {
		return 1.0;
	}

	@Override
	public String getIngredients() {
		return "Coffee";
	}
}
