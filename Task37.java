package com.company.training.array2;

import java.util.Random;

// Переставить строки матрицы случайным образом.

public class Task37 {
	
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		
		int[][] arr = new int [n][m];
		
		initArrayVal(arr);
		
		printArray(arr);
		
		System.out.println("");
		
		Random rand1 = new Random();
		
		for(int i = 0; i < 5; i++) {
			
			int[] temp1;
			int x = rand1.nextInt(n - 1);
			temp1 = arr[x];
			
			int[] temp2;
			int y = rand1.nextInt(n - 1);
			temp2 = arr[y];
			
		    arr[x] = temp2;
		    arr[y] = temp1;
			
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

}
