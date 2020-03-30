package ch10example01;

import java.math.BigInteger;

public class ch10example01 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("2");
		BigInteger c = a.multiply(b); // 9223372036854775807 * 2
		System.out.println(c);
		
		System.out.println("Bye.");
	}

}
