package com.company.training.array2;

import java.util.Random;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

public class Task28 {

	public static void main(String[] args) {

		int m = 3;
		int n = 3;

		int[][] arr = new int[m][n];

		createArrayRand(arr);
		printArray(arr);
		
		int maxSum = 0;

		int sumColumn = 0;
        int index = 0;

		
		for(int j = 0; j < n; j++) {
			
			for(int i = 0; i < arr.length; i++) {
				sumColumn+= arr[i][j];
			}
			
			if (sumColumn > maxSum) {
			maxSum = sumColumn;
			index = j;
		}
			sumColumn = 0;
		}
		
		int rowNumber = index + 1;
		
		System.out.println("Столбец с максимальной суммой элементов = " + rowNumber);

		
	}

	public static int[][] createArrayRand(int[][] arr) {
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
}
