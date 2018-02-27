package main.GoF.behavioral.chainOfResponsibility;

/**
 * Created by Tomas Cejpek on 27/02/2018.
 */
public class PresidentPP extends PurchasePower {

	@Override
	protected int getAllowable() {
		return DEFAULT_POWER * 10;
	}

	@Override
	protected String getRole() {
		return "President";
	}
}
