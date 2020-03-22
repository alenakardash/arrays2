package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1*2  0  0  ... 0  0    0
  0  2*3 0  ... 0  0    0
  0   0 3*4 ... 0  0    0
  0   0  0  .   0n(n-1) 0
  0   0  0   .  0   0  n(n+1)
 */

public class Task16 {
	
	public static void main(String[] args) {
		 int n = 6;
		 
		 int[][] arr = new int[n][n];
		 
		 int k = 1;
		 int index = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 for (int j = 0; j < arr[i].length; j++) {
				 
			 if(j == index) {
				 arr[i][j] = k * (k + 1);
			 }
			 
			 else {
				 arr[i][j] = 0;
			 }
		 }
			 k++;
			 index++;
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
