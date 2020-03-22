package com.company.training.array2;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

public class Task34 {
	
	public static void main(String[] args) {
		
		int m = 5;
		int n = 5;
		
		int[][] arr = new int[m][n];
		
		int index = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j < index) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = 0;
				}
			}
			index++;
		}
		printArray(arr);
		
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
