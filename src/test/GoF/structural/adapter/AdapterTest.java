package test.GoF.structural.adapter;

import main.GoF.structural.adapter.Adaptee;
import main.GoF.structural.adapter.Adapter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class AdapterTest {

	@Test
	public void adapterTest() {
		Adapter adapter = new Adapter();
		Assert.assertEquals("oldRequest", adapter.newRequest());
	}

	@Test
	public void adapterTest2() {
		Adapter adapter = new Adapter(new Adaptee());
		Assert.assertEquals("oldRequest", adapter.newRequest());
	}
}
