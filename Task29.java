package com.company.training.array2;

import java.util.Random;

//  Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int[][] arr = new int[n][n];
		
		createArrayRand(arr);
		printArray(arr);
		
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i][j] > 0) {
				System.out.print(arr[i][j] + " ");
			}
			j++;
		}
	}
	public static int[][] createArrayRand(int[][] arr) {
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10) - 2;
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
