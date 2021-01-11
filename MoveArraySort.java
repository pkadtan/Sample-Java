package test;

import java.util.Random;
import java.util.Scanner;

public class MoveArraySort {
	static int arraysize = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter Array Size : ");
		arraysize = s.nextInt();
		int[] array = new int[arraysize];
		int temp=0 , pos=0;
		for (int i = 0; i < arraysize; i++) {
			array[i] = r.nextInt(100) - 40;
			if(array[i]>temp)
			{
				temp = array[i];
			}
			System.out.print("\n" + array[i]);
		}

		for(int i = 0;i<arraysize ; i++)
		{
			if(array[i]>=0)
			{
				if(array[i]<temp)
				{
				pos = i;
				temp = array[i] ;
				}
			}
			
		}
		System.out.print("\nPosition is \t:\t"+pos + "\nElement is \t:\t"+temp);
	}
}
