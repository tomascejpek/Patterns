package main.GoF.structural.decorator;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class WithMilk extends CoffeeDecorator {

	public WithMilk(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Milk";
	}
}
