package test.GoF.structural.proxy;

import main.GoF.structural.proxy.Converter;
import main.GoF.structural.proxy.ProxyConverter;
import main.GoF.structural.proxy.RealConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class ProxyTest {

	@Test
	public void realTest() {
		Converter realConverter = new RealConverter();
		assertEquals(5, realConverter.toInt("5").intValue());
	}

	@Test(expected = NumberFormatException.class)
	public void realExceptionTest() {
		Converter realConverter = new RealConverter();
		// throw NumberFormatException
		realConverter.toInt("a");
	}

	@Test
	public void proxyGoodValueTest() {
		Converter proxy = new ProxyConverter();
		assertEquals(5, proxy.toInt("5").intValue());
	}

	@Test
	public void proxyBadValueTest() {
		Converter proxy = new ProxyConverter();
		// print "NUMBER is not a number", no exception
		proxy.toInt("NUMBER");

	}

}
