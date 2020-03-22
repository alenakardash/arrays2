package com.company.training.array2;

// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.

public class Task8 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1, -7, 3, 7, 7}, {4, -1, 3, 7, 5}, {4, 7, 2, 5, 7}, {3, 7, 4, 8, -1}, {7, 5, 3, 7, 1}};
		 
		 int count = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 for(int j = 0; j < arr[i].length; j++ ) {
				 
				 if(arr[i][j] == 7) {
					 count++;
					  }
				 
			 }
		 }
		 
		System.out.print(count); 
		
	}

}
