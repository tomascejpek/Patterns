package test.GoF.behavioral.strategy;

import main.GoF.behavioral.strategy.Customer;
import main.GoF.behavioral.strategy.HappyHoursStrategy;
import main.GoF.behavioral.strategy.NormalStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class StrategyTest {

	@Test
	public void normalStrategyTest() {
		Customer customer = new Customer(new NormalStrategy());
		customer.buyIt(1, 1); // 1 * 1
		customer.buyIt(2, 2); // 2 * 2
		// 1 * 1 + 2 * 2 = 5
		Assert.assertEquals(5, customer.getBill(), 0);
	}

	@Test
	public void happyHoursStrategyTest() {
		Customer customer = new Customer(new HappyHoursStrategy());
		customer.buyIt(1, 1); // 1 * 0.5 * 1
		customer.buyIt(2, 2); // 2 * 0.5 * 2
		// 1 * 0.5 * 1 + 2 * 0.5 * 2 = 5
		Assert.assertEquals(2.5, customer.getBill(), 0);
	}

	@Test
	public void strategyTest() {
		Customer customer = new Customer(new NormalStrategy());
		customer.buyIt(1, 1); // 1 * 1
		customer.buyIt(2, 2); // 2 * 2
		customer.setStrategy(new HappyHoursStrategy());
		customer.buyIt(1, 1); // 1 * 0.5 * 1
		customer.buyIt(2, 2); // 2 * 0.5 * 2
		// 5 + 2.5 = 7.5
		Assert.assertEquals(7.5, customer.getBill(), 0);
	}
}
