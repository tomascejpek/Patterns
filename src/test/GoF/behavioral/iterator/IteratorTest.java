package test.GoF.behavioral.iterator;

import main.GoF.behavioral.iterator.ArrayIterator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 03/03/2018.
 */
public class IteratorTest {

	@Test
	public void iteratorIntArrayTest() {
		final Integer[] expected = new Integer[]{1, 2, 3};
		final ArrayIterator<Integer> iterator = new ArrayIterator<>(expected);
		final List<Integer> results = new ArrayList<>();

		while (iterator.hashNext()) results.add(iterator.next());

		assertEquals(Arrays.toString(expected), results.toString());
	}
}
