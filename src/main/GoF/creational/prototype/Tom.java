package main.GoF.creational.prototype;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class Tom implements Person {

	private static final String NAME = "Tom";

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Tom) super.clone();
	}

	@Override
	public String toString() {
		return NAME;
	}
}
