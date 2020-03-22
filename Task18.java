package com.company.training.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1  1  1  ...  1  1  1
2  2  2  ...  2  2  0
3  3  3  ...  3  0  0
.  .  .  ...  .  .  .  
.  .  .  ...  .  .  .
.  .  .  ...  .  .  .
n-1 n-1  ...  0  0  0
n  0  0  ...  0  0  0
*/

public class Task18 {

	public static void main(String[] args) {
		int n = 6;

		int[][] arr = new int[n][n];

		int k = 1;

		int index = n;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (j < index) {
					arr[i][j] = k;
				} else {
					arr[i][j] = 0;
				}
			}
			k++;
			index--;
		}
		printArray(arr);
	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
