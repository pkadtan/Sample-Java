package test;

import java.util.Random;
import java.util.Scanner;

public class MinMaxArray {
static int arraysize =0;
	public static void main(String[] args) {
		int min , max ;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter Array Size : ");
		arraysize =s.nextInt();
		int[] array =new int[arraysize];
		for(int i=0 ; i<arraysize ; i++)
		{
			array[i]=Math.abs(r.nextInt(100));
		}
		min = array[0];
		max = array[0];
		System.out.print("\tArrays is \n");
		for(int i=0 ; i<arraysize ; i++)
		{
			System.out.println(array[i]);
			if(array[i] < min)
			{
				min = array[i];
			}
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.print("Minimum is : "+min + "\tMaximum is : "+ max);
	}

}
