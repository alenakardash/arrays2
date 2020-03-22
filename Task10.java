package com.company.training.array2;

import java.util.Random;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {

		int k = 2;
		int p = 3;

		int[][] arr = new int[8][4];

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = ran.nextInt(10);
			}
		}
		

		for (int i = 0; i < arr[k].length; i++) {

			System.out.print(arr[k - 1][i] + " ");
		}
		
		System.out.println("");
		

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][p - 1] + " ");
		}

	}
	
}