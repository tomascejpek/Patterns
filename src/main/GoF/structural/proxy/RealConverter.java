package main.GoF.structural.proxy;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class RealConverter implements Converter {

	@Override
	public Integer toInt(String s) {
		return Integer.parseInt(s);
	}
}
