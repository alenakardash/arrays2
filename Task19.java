package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1  1  1  1  1  1
 0  1  1  1  1  0
 0  0  1  1  0  0
 0  0  1  1  0  0
 0  1  1  1  1  0
 1  1  1  1  1  1
*/

public class Task19 {
	
	public static void main(String[] args) {
		int n = 10;
		
		int[][] arr = new int[n][n];
		
		int leftIndex = -1;
		int rightIndex = n;
		
		for(int i = 0; i < arr.length/2; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if (i == 0 || i == n - 1) {
					arr[i][j] = 1;
				}
				
				else {
					if(j <= leftIndex || j >= rightIndex) {
						arr[i][j] = 0;
					}
					else {
						arr[i][j] = 1;
					}
						
					}
                  
				}
			leftIndex++;
			rightIndex--;
			
			}
		
		leftIndex = arr.length / 2 - 2;
		rightIndex = arr.length / 2 + 1;
		
		for(int i = arr.length/2 - 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(j <= leftIndex || j >= rightIndex) {
					arr[i][j] = 0;
				}
				else {
					arr[i][j] = 1;
				}
				
			}
			leftIndex--;
			rightIndex++;
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
