package test.GoF.singleton;

import main.GoF.singleton.LazySingleton;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 21/02/2018.
 */
public class LazySingletonTest {

	@Test
	public void lazyTest() {
		LazySingleton lazy1 = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();

		assertSame(lazy1, lazy2);
	}
}
