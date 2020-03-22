package com.company.training.array2;

import java.util.Random;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task6 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[8][4];
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
			arr[i][j] = ran.nextInt(10);
		}
	}

		
		for(int i = 1; i < arr.length; i+= 2) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][arr[i].length - 1] < arr[i][0]) {
					
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println("");
		}
		
	}
	
}
