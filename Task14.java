package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 
0  0  0  0  0  1
0  0  0  0  2  0
0  0  0  3  0  0
. n-1 .  .  .  .
n  0  0  0  0  0
 
*/

public class Task14 {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int[][] arr = new int[n][n];
		
		int index = n - 1;
		int k = 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if(j == index) {
					arr[i][j] = k;
					
					k++;
					index--;
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
