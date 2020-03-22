package com.company.training.array2;

import java.util.Scanner;

/*С клавиатуры вводится двумерный массив чисел размерностью nxm. 
Выполнить с массивом следующие действия: а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.
*/

public class Task26 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество строк в массиве: ");
		
		int n = sc.nextInt();
		
		System.out.println("Введите количество столбцов в массиве: ");
		
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		System.out.println("Введите числа, принадлежащие массиву: ");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = sc.nextInt();

			}
		}
		printArray(arr);
		
		for(int i = 0; i < n; i++) {
			int sum = calcSumOfNegative(arr[i]);
			int rowNumber = i + 1;
			System.out.println("Sum of negative elements in " + rowNumber + " row = " + sum);
		}
		
		for(int i = 0; i < n; i++) {
			int max = findMax(arr[i]);
			int rowNumber = i + 1;
			
			System.out.println("Max value in " + rowNumber + " row = " + max);
		}
		
		int maxInArray = arr[0][0];
		int mMax = 0;
		int nMax = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > maxInArray) {
					maxInArray = arr[i][j];
					mMax = i;
					nMax = j;
				}
			}
		}
		
		System.out.println("Max element in array = " + maxInArray + " index: m = " + mMax + " n = " + nMax);
		
		int minInArray = arr[0][0];
		int mMin = 0;
		int nMin = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < minInArray) {
					minInArray = arr[i][j];
					mMin = i;
					nMin = j;
				}
			}
		}
		
		System.out.println("Min element in array = " + minInArray + " index: m = " + mMin + " n = " + nMin);
		
		arr[mMin][nMin] = maxInArray;
		arr[mMax][nMax] = minInArray;
		
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

public static int calcSumOfNegative(int[] arr) {
	int sum = 0;
	 
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] < 0) {
			sum+= arr[i];
		}
	}
	return sum;
}

public static int findMax(int[] arr) {
	 int max = arr[0];
	 
	 for(int i = 1; i < arr.length; i++) {
		 if(arr[i] > max) {
			 max = arr[i];
		 }
	 }
	 return max;
}

}
