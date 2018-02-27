package main.GoF.behavioral.chainOfResponsibility;

/**
 * Created by Tomas Cejpek on 27/02/2018.
 */
public abstract class PurchasePower {

	static final int DEFAULT_POWER = 100;
	private PurchasePower next = null;

	protected abstract int getAllowable();

	protected abstract String getRole();

	public void setNext(PurchasePower next) {
		this.next = next;
	}

	public PurchasePower handle(Request request) {
		if (request.getAmount() < getAllowable()) {
			System.out.println(getRole() + " will approve " + request.getAmount() + ".");
			return this;
		} else if (next != null) return next.handle(request);

		return null;
	}
}
