package com.company.training.array2;

import java.util.Random;

/* Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается как среднее арифметическое 
соседей соответствующего элемента исходной матрицы. Построить результат сглаживания заданной матрицы 
*/

public class Task36 {
	
	public static void main(String[] args) {
		
		int m = 5;
		
		int[][] arr = new int[m][m];
		
		initArrayVal(arr);
		
		printArray(arr);
		
		System.out.println("");
		
		arr[0][0] = (arr[1][0] + arr[0][1]) / 2;
		arr[0][arr[0].length - 1] = (arr[0][arr[0].length - 2] + arr[1][arr[1].length - 1]) / 2;
		
		arr[arr.length - 1][0] = (arr[arr.length - 2][0] + arr[arr.length - 1][1]) / 2;
		arr[arr.length - 1][arr[0].length - 1] = (arr[arr.length - 1][arr[0].length - 2] + arr[arr.length - 2][arr[0].length - 1]) / 2;
		
		
		for(int i = 0; i < 1; i++) {
			for(int j = 1; j < arr[i].length - 1; j++) {
				arr[i][j] = (arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j]) / 3;
			}
			
		}
		
		for(int i = arr.length - 1; i > arr.length - 2; i--) {
			for(int j = 1; j < arr[0].length - 1; j++) {
				arr[i][j] = (arr[i][j - 1] + arr[i][j + 1] + arr[i - 1][j]) / 3;
			}
			
		}
		
		for(int i = 1; i < arr.length - 1; i++) {
			arr[i][0] = (arr[i + 1][0] + arr[i][1] + arr[0][0]) / 3;
		}
		
		for(int i = 1; i < arr.length - 1; i++) {
			arr[i][arr[0].length - 1] = (arr[i][arr[0].length - 2] + arr[i + 1][arr[0].length - 1] + arr[i - 1][arr[0].length - 1]) / 3;
			
		}
		

		
		for(int i = 1; i < arr.length - 1; i++) {
			for(int j = 1; j < arr[i].length - 1; j++) {
				arr[i][j] = (arr[i][j - 1] + arr[i][j + 1] + arr[i - 1][j] + arr[i + 1][j]) / 4;
				
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

}
