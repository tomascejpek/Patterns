package main.GoF.behavioral.chainOfResponsibility;

/**
 * Created by Tomas Cejpek on 27/02/2018.
 */
public class Handler {

	private final ManagerPP manager = new ManagerPP();

	public Handler() {
		DirectorPP director = new DirectorPP();
		manager.setNext(director);
		director.setNext(new PresidentPP());
	}

	public PurchasePower handle(Request request) {
		return manager.handle(request);
	}

}
