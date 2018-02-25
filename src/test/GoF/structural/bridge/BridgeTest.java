package test.GoF.structural.bridge;

import main.GoF.structural.bridge.CircleEnum;
import main.GoF.structural.bridge.HighQualityDrawer;
import main.GoF.structural.bridge.LowQualityDrawer;
import main.GoF.structural.bridge.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas Cejpek on 25/02/2018.
 */
public class BridgeTest {

	@Test
	public void bridgeLowQualityTest() {
		Shape shape = new Shape(new LowQualityDrawer());
		assertEquals(CircleEnum.LOW_QUALITY_CIRCLE, shape.drawCircle());
	}

	@Test
	public void bridgeHighQualityTest() {
		Shape shape = new Shape(new HighQualityDrawer());
		assertEquals(CircleEnum.HIGH_QUALITY_CIRCLE, shape.drawCircle());
	}
}
