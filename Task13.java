package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    1  2   3   ... n
    n  n-1 n-2 ... 1
    1  2   3   ... n
    n  n-1 n-2 ... 1
    .   .   . .    .
    .   .   .  .   .
    .   .   .   .  .
    n  n-1 n-2 ... 1
 */

public class Task13 {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i % 2 == 0) {
				
				int k = 1;
				
				for(int j = 0; j < arr.length; j++) {
					
					arr[i][j] = k;
					k++;
					
				}
			}
			
			else {
				int p = n;
				
				for(int l = 0; l < arr[i].length; l++) {
					
					arr[i][l] = p;
					p--;
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
