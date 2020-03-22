package com.company.training.array2;

/* Сформировать квадратную матрицу порядка N по правилу:
         sin (I*I - J*J)
A(ij) =  _______________
              N
              
и подсчитать количество положительных элементов в ней.
*/

public class Task23 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		double[][] arr = new double[n][n];
		
		double x;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				
				x = Math.sin(Math.pow(i, 2) - Math.pow(j, 2)) / n;
				
				arr[i][j] = x;
			}
		}
		
		int positive;
		
		positive = calcPositiveVal(arr);
		
		System.out.print(positive);
	}

public static int calcPositiveVal(double[][] arr) {
	int count = 0;
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			if(arr[i][j] > 0) {
				count++;
			}
		}
	}
	return count;
}

}
