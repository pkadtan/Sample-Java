package test;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
	static int arraysize = 0;

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		arraysize = sc.nextInt();
		int[] array = new int[arraysize];
		int[] rarray = new int[arraysize];
		for(int i = 0 ; i<arraysize ; i++)
		{
			array[i]=Math.abs(r.nextInt(4-1));
		}
		System.out.print("Array is \n");
		for(int i = 0 ; i<arraysize ; i++)
		{
		System.out.print("\n" +i +"  "+array[i]);
		rarray[Math.abs(arraysize-1-i)] = array[i];
		}
		System.out.print("\nReverse Array is \n");
		for(int i = 0 ; i<arraysize ; i++)
		{
			System.out.print("\n " +i +"\t" + array[i]+ "\t"+rarray[i]);
		}
	}
}
