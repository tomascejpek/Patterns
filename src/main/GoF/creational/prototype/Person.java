package main.GoF.creational.prototype;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public interface Person extends Cloneable {

	Person clone() throws CloneNotSupportedException;
}
