package com.company.training.array2;

/* Получить квадратную матрицу порядка n:
1    2    3    4    n
n+1  n+2  n+3  n+4  2n
2n+1 2n+2 2n+3 2n+4 3n
.    .    .    .    . 
.    .    .    .    . 
.    .    .    .    . 
(n-1)n+1            n²
 */

public class Task25 {
	
	public static void main(String[] args) {
		 int n = 5;
		 
		 int[][] arr = new int[n][n];
		 
		 int val = 1;
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length; j++) {
				 arr[i][j] = val;
				 val++;
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
