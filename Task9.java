package com.company.training.array2;

import java.util.Random;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task9 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j< arr[i].length; j++) {
				
				arr[i][j] = ran.nextInt(10);
				
				}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i][i] + " ");
		}
	}

}
