package test;

import java.util.Random;
import java.util.Scanner;

public class TwoFinal {
	public static void printArray(int r, int c, int[][] arr) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] cal(int row, int column, int column1, int[][] arr1,
			int[][] arr2) {
		int[][] rans = new int[column][column1];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column1; j++) {
				rans[i][j] = 0;
				for (int k = 0; k < column; k++) {

					rans[i][j] += arr1[i][k] * +arr2[k][j];
				}
			}
		}
		return rans;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int row, column, column1;
		System.out.print("Enter Row\t:\t");
		row = s.nextInt();
		System.out.print("Enter Column\t:\t");
		column = s.nextInt();
		System.out.print("Enter 2nd Column\t:\t");
		column1 = s.nextInt();
		int[][] arr1 = new int[row][column];
		int[][] arr2 = new int[column][column1];
		int[][] ans = new int[column][column1];
		System.out.print("\t1st array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[i][j] = Math.abs(r.nextInt(10) + 2);
			}
		}
		System.out.println();
		System.out.print("\t2nd array");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < column1; j++) {
				arr2[i][j] = Math.abs(r.nextInt(10) + 2);
			}

		}
		System.out.println("1st Array \n");
		printArray(row, column, arr1);
		System.out.println("2nd Array \n");
		printArray(column, column1, arr2);
		ans = cal(row, column, column1, arr1, arr2);
		System.out.println("Answer Is \n");
		printArray(column, column1, ans);

	}

}
