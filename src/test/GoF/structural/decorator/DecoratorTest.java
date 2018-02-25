package test.GoF.structural.decorator;

import main.GoF.structural.decorator.Coffee;
import main.GoF.structural.decorator.SimpleCoffee;
import main.GoF.structural.decorator.WithMilk;
import main.GoF.structural.decorator.WithSugar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class DecoratorTest {

	@Test
	public void simpleCoffeeTest() {
		Coffee coffee = new SimpleCoffee();
		assertEquals(1.0, coffee.getCost(), 0);
		assertEquals("Coffee", coffee.getIngredients());
	}

	@Test
	public void withMilkTest() {
		Coffee coffee = new SimpleCoffee();
		coffee = new WithMilk(coffee);
		assertEquals(1.5, coffee.getCost(), 0);
		assertEquals("Coffee, Milk", coffee.getIngredients());
	}

	@Test
	public void withMilkAndSugarTest() {
		Coffee coffee = new SimpleCoffee();
		coffee = new WithMilk(coffee);
		coffee = new WithSugar(coffee);
		assertEquals(1.8, coffee.getCost(), 0);
		assertEquals("Coffee, Milk, Sugar", coffee.getIngredients());
	}

	@Test
	public void withSugar() {
		Coffee coffee = new SimpleCoffee();
		coffee = new WithSugar(coffee);
		assertEquals(1.3, coffee.getCost(), 0);
		assertEquals("Coffee, Sugar", coffee.getIngredients());
	}

}
