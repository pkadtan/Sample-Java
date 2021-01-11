package test;

import java.util.Scanner;

public class Print0to9 {
	static int arraysize = 0;

	public static String convert(int array) {
		switch (array) {
		case 0:
			return "Zero";
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default:
			return "Ten or Greater than Ten";

		}

	}

	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		arraysize = s.nextInt();
		int[] array = new int[arraysize];
		String[] strarray = new String[arraysize];

		for (int i = 0; i < arraysize; i++) {
			System.out.print("\nEnter Array Element : ");
			temp = s.nextInt();
			if (temp > 10) {
				System.out.print("\nPlease Enter Array Element between 0 to 9 : ");
				temp = s.nextInt();
				array[i] = temp;
				strarray[i] = convert(array[i]);
			} else {
				array[i] = temp;
				strarray[i] = convert(array[i]);
			}

		}
		System.out.print("\nConverted Number is \n");
		for (int i = 0; i < arraysize; i++) {
			System.out.println(strarray[i]);
		}
	}

}
