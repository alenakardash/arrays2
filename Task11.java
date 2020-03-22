package com.company.training.array2;

import java.util.Random;

/* Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, 
 третья строка справа налево и так далее.
*/

public class Task11 {
	
	public static void main(String[] args) {
		
		int m = 5;
		int n = 7;
		
		int[][] arr = new int[m][n];
		
		initArrayValues(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i % 2 == 0) {
				for(int j = arr[i].length - 1; j > - 1; j--) {
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println("");
			}
			
			else {
				for(int k = 0; k < arr[i].length; k++) {
					
					System.out.print(arr[i][k] + " ");
				}
				System.out.println("");
			}
		
		}
		
			
		}
	
	public static int[][] initArrayValues(int[][] arr) {
		
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = ran.nextInt(10);
			}
		}
		return arr;
	}
	
}


