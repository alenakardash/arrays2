package com.company.training.array2;

/* Получить квадратную матрицу порядка n:
    
    0  0  0  ... 0  0
    0  1  0  ... 0  0
    0  0  2  ... 0  0
    .  .  .       ...
    .  .  . .     ...
    .  .  .   .   ...
    0  0  0 ... 0 n-1
*/


public class Task12 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int[][] arr = new int[n][n];
		
		int k = 0;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i][index] = k;
			
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if(j != index) {
				arr[i][j] = 0;
			}
		}
			index++;
			k++;
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
