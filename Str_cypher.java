package test;

import java.util.Scanner;

public class Str_cypher {

	public static void main(String[] args) {
		String str, str1 = "" ;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A String : ");
		str = s.next();
		for (int i = 0; i < str.length(); i++) {
			str1 += Character.toString((char) (((int) str.charAt(i)) + 1));
		}
		System.out.print("\n Old String :\t"+str + "\n New String :\t"+str1);
	}

}
