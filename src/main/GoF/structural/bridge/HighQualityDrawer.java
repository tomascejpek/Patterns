package main.GoF.structural.bridge;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class HighQualityDrawer implements Drawer {

	@Override
	public CircleEnum drawCircle() {
		return CircleEnum.HIGH_QUALITY_CIRCLE;
	}
}
