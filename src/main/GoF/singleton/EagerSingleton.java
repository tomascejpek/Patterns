package main.GoF.singleton;

/**
 * Created by Tomas Cejpek on 18/02/2018.
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}

}

