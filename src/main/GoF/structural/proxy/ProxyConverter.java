package main.GoF.structural.proxy;

/**
 * Created by Tomas Cejpek on 26/02/2018.
 */
public class ProxyConverter implements Converter {

	private final Converter realConverter;

	public ProxyConverter() {
		this.realConverter = new RealConverter();
	}

	@Override
	public Integer toInt(String s) {
		try {
			return realConverter.toInt(s);
		} catch (NumberFormatException nfe) {
			System.out.println(String.format("%s is not a number", s));
		}
		return null;
	}
}
