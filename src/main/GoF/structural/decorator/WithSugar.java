package main.GoF.structural.decorator;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class WithSugar extends CoffeeDecorator {

	public WithSugar(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.3;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Sugar";
	}
}
