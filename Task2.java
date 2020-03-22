package com.company.training.array2;

import java.util.Random;

// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Task2 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = ran.nextInt(10);
			}
		}
		
		printArray(arr);
	}
	
	public static void printArray(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		
		}
	}

}
