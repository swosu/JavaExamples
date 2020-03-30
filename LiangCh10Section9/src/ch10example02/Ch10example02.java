package ch10example02;

import java.math.BigDecimal;

public class Ch10example02 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
		BigDecimal a = new BigDecimal(1.0);
		BigDecimal b = new BigDecimal(3);
		BigDecimal c = a.divide(b, 2, BigDecimal.ROUND_UP);
		System.out.println(c);

		System.out.println("Bye.");
	}

}
