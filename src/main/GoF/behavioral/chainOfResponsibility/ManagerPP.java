package main.GoF.behavioral.chainOfResponsibility;

/**
 * Created by Tomas Cejpek on 27/02/2018.
 */
public class ManagerPP extends PurchasePower {

	@Override
	protected int getAllowable() {
		return DEFAULT_POWER;
	}

	@Override
	protected String getRole() {
		return "Manager";
	}
}
