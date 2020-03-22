package com.company.training.array2;

// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task7 {
	
 public static void main(String[] args) {
	 
	 int[][] arr = {{1, -5, 3, -3, 7}, {4, -1, 3, -2, 5}, {4, -9, 2, 5, -3}, {3, -2, 4, 8, -1}, {-4, 5, 3, 2, 1}};
	 
	 int sum = 0;
	 
	 for(int i = 0; i < arr.length; i++) {
		 
		 for(int j = 0; j < arr[i].length; j++ ) {
			 
			 if(arr[i][j] < 0 && arr[i][j] % 2 != 0) {
				 
				 sum += Math.abs(arr[i][j]);
			 }
			 
		 }
	 }
	 
	System.out.print(sum); 
	
}

}
