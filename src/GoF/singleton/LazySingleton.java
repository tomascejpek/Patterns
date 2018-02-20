package GoF.singleton;

/**
 * Created by Tomas Cejpek on 18/02/2018.
 */
public class LazySingleton {
	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) instance = new LazySingleton();
		return instance;
	}
}

