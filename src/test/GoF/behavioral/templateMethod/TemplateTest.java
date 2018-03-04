package test.GoF.behavioral.templateMethod;

import main.GoF.behavioral.templateMethod.ConcreteClass1;
import main.GoF.behavioral.templateMethod.ConcreteClass2;
import org.junit.Test;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class TemplateTest {

	@Test
	public void templateTest() {
		System.out.println("**** TEMPLATE METHOD TEST ****");
		new ConcreteClass1().printAll();
		new ConcreteClass2().printAll();
		System.out.println("******************************");
	}
}
