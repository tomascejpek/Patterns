package main.GoF.behavioral.iterator;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class ArrayIterator<T> implements Iterator<T> {

	private final T[] array;
	private final int lastIndex;
	private int index;

	public ArrayIterator(final T[] array) {
		this.array = array;
		this.lastIndex = array.length - 1;
		this.index = -1;
	}

	@Override
	public boolean hashNext() {
		return this.index < this.lastIndex;
	}

	@Override
	public T next() {
		return array[++index];
	}
}
