package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1  1  1  ...  1  1  1
1  0  0  ...  1  1  1
1  0  0  ...  0  0  1
.  .  .       .  .  .
.  .  .  .    .  .  .
.  .  .    .  .  .  .
1  0  0  ...  0  0  1
1  1  1  ...  1  1  1
*/

public class Task17 {
	
	public static void main(String[] args) {
		 int n = 6;
		 
		 int[][] arr = new int[n][n];
		 
		 for (int i = 0; i < arr.length; i++ ) {
			 
			 for(int j = 0; j < arr[i].length; j++) {
				 
				  if(i == 0 || i == arr[i].length - 1) {
					  arr[i][j] = 1;
				  }
				  
				  else {
					  if(j == 0 || j == arr[i].length - 1) {
						  arr[i][j] = 1;
						  
					  }
					  else {
					       arr[i][j] = 0;
					  }
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
