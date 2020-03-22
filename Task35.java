package com.company.training.array2;

import java.util.Random;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task35 {

	public static void main(String[] args) {

		int n = 5;

		int[][] arr = new int[n][n];

		initArrayVal(arr);

		int arrayMax = findMax(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = arrayMax;
				}
			}
		}

		printArray(arr);

	}

	public static int[][] initArrayVal(int[][] arr) {

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10);
			}
		}
		return arr;
	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int findMax(int[][] arr) {
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

}
