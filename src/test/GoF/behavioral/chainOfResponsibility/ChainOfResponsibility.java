package test.GoF.behavioral.chainOfResponsibility;

import main.GoF.behavioral.chainOfResponsibility.*;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

/**
 * Created by Tomas Cejpek on 27/02/2018.
 */
public class ChainOfResponsibility {

	private final Handler handler = new Handler();
	private final Request request = new Request(0);

	@Test
	public void managerTest() {
		request.setAmount(80);
		assertSame(ManagerPP.class, handler.handle(request).getClass());
	}

	@Test
	public void directorTest() {
		request.setAmount(200);
		assertSame(DirectorPP.class, handler.handle(request).getClass());
	}

	@Test
	public void presidentTest() {
		request.setAmount(600);
		assertSame(PresidentPP.class, handler.handle(request).getClass());
	}

	@Test
	public void tooMuch() {
		request.setAmount(2000);
		assertNull(handler.handle(request));
	}
}
