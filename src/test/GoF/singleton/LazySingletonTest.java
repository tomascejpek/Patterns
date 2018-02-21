package test.GoF.singleton;

import GoF.singleton.EagerSingleton;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 21/02/2018.
 */
public class LazySingletonTest {

	@Test
	public void eagerTest() {
		EagerSingleton lazy1 = EagerSingleton.getInstance();
		EagerSingleton lazy2 = EagerSingleton.getInstance();

		assertSame(lazy1, lazy2);
	}
}
