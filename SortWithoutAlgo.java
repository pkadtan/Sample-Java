package test;

import java.util.Random;
import java.util.Scanner;

public class SortWithoutAlgo {
	static int arraysize = 0;

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		arraysize = s.nextInt();
		int[] array = new int[arraysize];
		int[] sarray = new int[arraysize];
		int zcount = 0, ocount = 0;
		for (int i = 0; i < arraysize; i++) {
			array[i] = Math.abs(r.nextInt(4 - 1));
		}
		for (int i = 0; i < arraysize; i++) {
			System.out.print("\n" + array[i]);
			if (array[i] == 0) {
				zcount++;
			}
			if (array[i] == 1) {
				ocount++;
			}

		}
		for (int i = 0; i < arraysize; i++) {
			for (int j = 0; j < zcount; j++) {
				if (array[i] == 0) {
					sarray[j] = array[i];
				}
			}
			for (int j = ocount - 1; j < zcount + ocount; j++) {
				if (array[i] == 1) {
					sarray[j] = array[i];
				}
			}
			for (int j = zcount + ocount - 1; j < arraysize; j++) {
				if (array[i] == 2) {
					sarray[j] = array[i];
				}
			}

		}
		System.out.print("\nSorted array");
		for (int j = 0; j < arraysize; j++) {
			System.out.print("\n" + sarray[j]);
		}

	}

}
