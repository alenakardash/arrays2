package com.company.training.array2;

import java.util.Random;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task33 {
public static void main(String[] args) {
		
		int n = 5;
		
		int[][] arr = new int[n][n];
		
		initArrayVal(arr);
		
		printArray(arr);
		
        for(int j = 0; j < arr.length; j++) {
        	for(int out = arr.length - 1; out > 0; out--) {
        		for(int in = 0; in < out; in++) {
        			if(arr[in][j] > arr[in + 1][j]) {
        				int temp = arr[in][j];
        				arr[in][j] = arr[in + 1][j];
        				arr[in + 1][j] = temp;
        			}
        		}
        	}
        	
        }
        
        System.out.println("Columns sorted ASC");
        
        printArray(arr);
        
        for(int j = 0; j < arr.length; j++) {
        	for(int out = arr.length - 1; out > 0; out--) {
        		for(int in = 0; in < out; in++) {
        			if(arr[in][j] < arr[in + 1][j]) {
        				int temp = arr[in][j];
        				arr[in][j] = arr[in + 1][j];
        				arr[in + 1][j] = temp;
        			}
        		}
        	}
        	
        }
        
        System.out.println("Columns sorted DESC");
        
        printArray(arr);
		
		}
	
	public static int[][] initArrayVal(int[][] arr) {

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
	
	public static int[] sortAsc(int[] mas) {
		int temp;
		for(int i = mas.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(mas[j] > mas[j + 1]) {
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
			}
		}
		return mas;
	}
	public static int[] sortDesc(int[] mas) {
		int temp;
		for(int i = mas.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(mas[j] < mas[j + 1]) {
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
			}
		}
		return mas;
	}


}
