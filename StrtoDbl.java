package test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class StrtoDbl {

	public static String cnvrt(Double arg1, Double arg2)
			throws ArithmeticException {
		DecimalFormat dec = new DecimalFormat("#0.0");
		try {
			if (arg2 == 0) {
				throw new ArithmeticException();
			}
			return dec.format(arg1 / arg2);

		} catch (ArithmeticException e) {
			System.out.println("Zero cannot divide any number \n"
					+ e.getMessage());
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Double var1, var2;
		var1 = r.nextDouble() * 1000;
		var2 = r.nextDouble() * 10;
		System.out.print("Enter 1st number : " + var1);
		// var1 = s.nextDouble();
		System.out.print("Enter 2nd number : " + var2);
		// var2 = s.nextDouble();
		System.out.print("1st Value : " + var1 + " 2nd Value : " + var2
				+ "\nAnswer : " + cnvrt(var1, var2));

	}
}
