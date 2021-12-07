package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double price, double dollars) {
		
		return price * dollars * (1.0 + IOF);
		
	}
	
}
