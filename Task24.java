package com.company.training.array2;

/* Дан линейный массив. Получить действительную квадратную матрицу порядка n: 
x1  x2  x3  xn
x1² x2² x3² xn²
x1³ x2³ x3³ xn³ 
*/

public class Task24 {

	public static void main(String[] args) {

		int n = 5;

		double[] mas = { 1, 2, 3, 4, 5 };

		int pow = 1;
		double value;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				value = Math.pow(mas[j], pow);
				arr[i][j] = (int) value;
			}
			pow++;
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
