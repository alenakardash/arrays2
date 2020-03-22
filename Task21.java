package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
n   0   0   0   0   0
n-1 n   0   0   0   0
n-2 n-1 n   0   0   0
.   .   .   .   .   .
.   .   .   .   .   .
.   .   .  n-1   n  0 
1   2   3  n-2  n-1 n
 */

public class Task21 {
	
	public static void main(String[] args) {
		
	int n = 8;
	
	int[][] arr = new int[n][n];
	
	int index = n;
	int k = n;
	
	for (int i = arr.length - 1; i >= 0; i--) {
		
		k = n;
		index--;
		
		for(int j = arr[i].length - 1; j >= 0; j--) {
			
			if(j <= index) {
			arr[i][j] = k;
			k--;
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
