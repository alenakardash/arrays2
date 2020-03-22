package com.company.training.array2;

import java.util.Random;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается 
три и более раз.
*/

public class Task30 {

	public static void main(String[] args) {

		int m = 10;
		int n = 15;
		
		int[][] arr = new int[m][n];

		initArrayVal(arr);
		printArray(arr);
		
		int count5 = 3;
		
		int count;
		int rowNumber = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			count = 0;
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j] == 5) {
					count++;
				}
			}
			if(count >= count5) {
				rowNumber = i + 1;
				System.out.print(rowNumber + " ");
			}
		}
		
	}

	public static int[][] initArrayVal(int[][] arr) {
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(16);
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
