package com.company.training.array2;

import java.util.Scanner;

import java.util.Random;

/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции 
другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
*/

public class Task27 {

	public static void main(String[] args) {
		int m;
		int n;

		m = 5;
		n = 7;

		int[][] arr = new int[m][n];

		arr = createArrayRand(arr);

		printArray(arr);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Число столбцов в массиве = " + n + ". Введите номер первого столбца: ");
		
		while(!sc.hasNextInt()) {
			System.out.println("Ввод неверный. введите число от 0 до " + n + " : ");
			sc.next();
		}
		int k1 = sc.nextInt();
		
		while(k1 < 0 || k1 > n) {
			System.out.println("Ввод неверный. введите число от 0 до " + n + " : ");
			k1 = sc.nextInt();
		}

		
		System.out.println("Введите номер второго столбца: ");
		
		while(!sc.hasNextInt()) {
			System.out.println("Ввод неверный. введите число от 0 до " + n + " : ");
			sc.next();
		}
		int k2 = sc.nextInt();
		
		while(k2 < 0 || k2 > n) {
			System.out.println("Ввод неверный. введите число от 0 до " + n + " : ");
			k2 = sc.nextInt();
		}

		
		k1 = k1 -1;
		k2 = k2 - 1;
		
		int[] k1Array = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			k1Array[i] = arr[i][k1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i][k1] = arr[i][k2];
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][k2] = k1Array[i];
		}
		printArray(arr);
	}

	public static int[][] createArrayRand(int[][] arr) {
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = ran.nextInt(10);
			}
		}
		return arr;
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
