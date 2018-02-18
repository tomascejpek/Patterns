package Singleton;

/**
 * Created by Tomas Cejpek on 18/02/2018.
 */
public class Singleton {
	private static final Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

}

