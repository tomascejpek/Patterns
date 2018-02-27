package main.GoF.behavioral.chainOfResponsibility;

/**
 * Created by Tomas Cejpek on 27/02/2018.
 */
public class DirectorPP extends PurchasePower {

	@Override
	protected int getAllowable() {
		return DEFAULT_POWER * 5;
	}

	@Override
	protected String getRole() {
		return "Director";
	}
}
