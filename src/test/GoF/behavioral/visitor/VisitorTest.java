package test.GoF.behavioral.visitor;

import main.GoF.behavioral.visitor.*;
import org.junit.Test;

/**
 * Created by Tomas Cejpek on 04/03/2018.
 */
public class VisitorTest {

	@Test
	public void visitorTest() {
		Cinema cinema = new Cinema();
		Theater theater = new Theater();
		Visitor tom = new TomVisitor();
		Visitor peter = new PeterVisitor();

		System.out.println("******* VISITOR TEST *******");
		cinema.accept(tom);
		theater.accept(tom);
		cinema.accept(peter);
		theater.accept(peter);
		System.out.println("****************************");
	}
}
