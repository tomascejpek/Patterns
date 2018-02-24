package test.GoF.creational.prototype;

import main.GoF.creational.prototype.Person;
import main.GoF.creational.prototype.Tom;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class PrototypeTest {

	@Test
	public void prototypeTest() throws CloneNotSupportedException {
		Person tom1 = new Tom();
		Person tom2 = tom1.clone();

		// same class
		assertSame(tom1.getClass(), tom2.getClass());
		// different object
		assertNotSame(tom1, tom2);
		// what's the name?
		assertEquals("Tom", tom2.toString());
	}
}
