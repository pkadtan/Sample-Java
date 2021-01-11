package test;

import java.util.Random;
import java.util.Scanner;

public class BBLSort {
static Scanner s = new Scanner(System.in);
static Random r = new Random();
static int arraySize =0;
	public static int[] genarr(int size)
	{
		int[] ar = new int[size];
		for(int i = 0 ;i<size;i++)
		{
			ar[i]=Math.abs(r.nextInt(100));
		}
		return ar;
	}
	public static int[] sort(int[] arr ,int size )
	{
		int temp;
		for(int i=0 ;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
//					System.out.print(" If "+arr[i] +" "+ arr[j]);
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;							
				}
			}
		}
		
		return arr;
	}
	public static void printArray(int[] arr , int size) {
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	public static void main(String[] args) {
		System.out.print("Enter Array Size");	
		arraySize = s.nextInt();
		int[] ar = new int[arraySize];
		ar = genarr(arraySize);
		System.out.print("\nArrays is : ");
		printArray(ar , arraySize);
		System.out.print("\nSorted Arrays is : ");
		ar=sort(ar , arraySize);
		printArray(ar , arraySize);


	}

}
