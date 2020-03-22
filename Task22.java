package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1   2   3   n-2   n-1   n
2   3   n-2 n-1    n    0
3   4   5    n     0    0
n-1 n   0    0     0    0
n   0   0    0     0    0 
 */

public class Task22 {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int[][] arr = new int[n][n];
		
		int k = 1;
		int number = k - 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			number++;
			k = number;
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if(k < n + 1) {
				arr[i][j] = k;
				k++;
				}
				
				else {
					arr[i][j] = 0;
				}
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
