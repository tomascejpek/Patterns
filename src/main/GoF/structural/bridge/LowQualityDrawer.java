package main.GoF.structural.bridge;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class LowQualityDrawer implements Drawer {

	@Override
	public CircleEnum drawCircle() {
		return CircleEnum.LOW_QUALITY_CIRCLE;
	}
}
