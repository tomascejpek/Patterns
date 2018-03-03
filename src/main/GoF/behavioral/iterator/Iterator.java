package main.GoF.behavioral.iterator;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public interface Iterator<T> {

	boolean hashNext();

	T next();
}
