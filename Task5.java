package com.company.training.array2;

import java.util.Random;

// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task5 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[8][5];
		
		Random ran = new Random();
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = ran.nextInt(10);
			}
		}
		
		
		for (int i = 0; i < arr.length; i+=2) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
