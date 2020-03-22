package com.company.training.array2;

import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки.

public class Task4 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = ran.nextInt(100);
			}
		}
		
		
		for(int j = 0; j < arr[0].length; j++) {
			
			System.out.print(arr[0][j] + " ");
		}
		
		System.out.println("");
		
        for(int j = 0; j < arr[arr.length - 1].length; j++) {
			
			System.out.print(arr[arr.length - 1][j] + " ");
		}
	}

}
