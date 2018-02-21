package test.GoF.singleton;

import GoF.singleton.EagerSingleton;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 21/02/2018.
 */
public class EagerSingletonTest {

	@Test
	public void eagerTest() {
		EagerSingleton eager1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();

		assertSame(eager1, eager2);
	}
}
