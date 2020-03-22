package com.company.training.array2;

import java.util.Random;

// Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task31 {

	public static void main(String[] args) {

		int m = 5;
		int n = 5;

		int[][] arr = new int[m][n];

		initArrayVal(arr);
		
		printArray(arr);
		
		int count = 0;
		
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		if(arr[i][j] / 10 > 0 && arr[i][j] / 100 == 0) {
        			count++;
        		}
        	}
        }
        System.out.print(count);
        

	}

	public static int[][] initArrayVal(int[][] arr) {

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(1000);
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
