package test.GoF.structural.composite;

import main.GoF.structural.composite.Component;
import main.GoF.structural.composite.Composite;
import main.GoF.structural.composite.Leaf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class CompositeTest {

	@Test
	public void compositeTest() {
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		Component leaf3 = new Leaf();
		Component leaf4 = new Leaf();

		Composite composite1 = new Composite();
		Composite composite2 = new Composite();
		Composite composite3 = new Composite();

		composite1.add(leaf1);
		composite1.add(leaf2);
		composite1.add(leaf3);

		composite2.add(leaf4);

		composite3.add(composite1);
		composite3.add(composite2);

		assertEquals(4, composite3.doSomething());

		composite3.remove(composite1);

		assertEquals(1, composite3.doSomething());
	}
}
