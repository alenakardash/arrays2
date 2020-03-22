package com.company.training.array2;

import java.util.Random;

// Найдите сумму двух матриц

public class Task38 {

	public static void main(String[] args) {
		int n = 5;

		int[][] arr1 = new int[n][n];

		initArrayVal(arr1);
		
		System.out.println("Array 1");
		System.out.println("");

		printArray(arr1);


		int[][] arr2 = new int[n][n];

		initArrayVal(arr2);
		
		System.out.println("");
		System.out.println("Array 2");
		System.out.println("");

		printArray(arr2);


		int[][] res = new int[n][n];

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("");
		System.out.println("Result Array");
		System.out.println("");
		
		
		printArray(res);

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

}
