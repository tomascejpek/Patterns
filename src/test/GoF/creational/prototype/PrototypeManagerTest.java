package test.GoF.creational.prototype;

import main.GoF.creational.prototype.Jerry;
import main.GoF.creational.prototype.Person;
import main.GoF.creational.prototype.PrototypeManager;
import main.GoF.creational.prototype.Tom;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class PrototypeManagerTest {

	@Test
	public void managerTest() throws CloneNotSupportedException {
		PrototypeManager manager = new PrototypeManager();
		Person tom1 = new Tom();
		Person jerry1 = new Jerry();
		//register Tom and Jerry
		manager.register(tom1.toString(), tom1);
		manager.register(jerry1.toString(), jerry1);
		// Tom clone
		Person tom2 = manager.clone(tom1.toString());
		assertNotSame(tom1, tom2);
		assertEquals("Tom", tom2.toString());
		// Jerry clone
		Person jerry2 = manager.clone(jerry1.toString());
		assertNotSame(jerry1, jerry2);
		assertEquals("Jerry", jerry2.toString());
		// unregister
		manager.unregister(tom1.toString());
		assertNull(manager.clone(tom1.toString()));
		manager.unregister(jerry1.toString());
		assertNull(manager.clone(jerry1.toString()));
	}
}
