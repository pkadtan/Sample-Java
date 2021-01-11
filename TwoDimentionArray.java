package test;

import java.util.Random;
import java.util.Scanner;

public class TwoDimentionArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int row, column;
		System.out.print("Enter Row\t:\t");
		row = s.nextInt();
		System.out.print("Enter Column\t:\t");
		column = s.nextInt();
		int[][] arr1 = new int[row][column];
		int[][] arr2 = new int[column][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[i][j]=s.nextInt();
//				arr1[i][j] = Math.abs(r.nextInt(10) + 2);
			}
		}

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("2nd Array");
				arr2[i][j]=s.nextInt();
//				arr2[i][j] = Math.abs(r.nextInt(10) + 2);
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.print("\n");
		}

		System.out.print("\n2ND Array\n");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.print("\n");
		}
		if (row > column) {
			int[][] ans = new int[row][row];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < row; j++) {
					ans[i][j] = 0;
					for (int k = 0; k < column; k++) {
						ans[i][j] += arr1[i][k] * arr2[k][j];
						System.out.print("\tAnswer " + ans[i][j] + "="
								+ arr1[i][k] + " * " + arr2[k][j]);
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out
					.print("\n*************************Ans Array*************************\n");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < row; j++) {
					System.out.print(ans[i][j] + "\t");
				}
				System.out.print("\n");
			}
		} else {
			int[][] ans = new int[column][column];

			for (int i = 0; i < column; i++) {
				for (int j = 0; j < column; j++) {
					ans[i][j] = 0;
					for (int k = 0; k < row; k++) {
						ans[i][j] += arr1[k][i] * arr2[j][k];
						System.out.print("\tAnswer " + ans[i][j] + "="
								+ arr1[i][k] + " * " + arr2[k][j]);
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out
					.print("\n*************************Ans Array*************************\n");
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < column; j++) {
					System.out.print(ans[i][j] + "\t");
				}
				System.out.print("\n");
			}

		}
	}
}
