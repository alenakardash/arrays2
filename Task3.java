package com.company.training.array2;

import java.util.Random;

// Дана матрица. Вывести на экран первый и последний столбцы.

public class Task3 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " | " + arr[i][arr[i].length - 1]);
		}
		
	}

}
