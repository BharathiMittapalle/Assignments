package com.assignments;

public class Assignment9 {

	public static void main(String[] args) {
		
		int[] arrayVal = { 12, 34, 11, 36, 87, 98, 93 };
		int temp = 0;
		for (int i = 0; i < arrayVal.length; i++) {
			for (int j = i + 1; j < arrayVal.length; j++) {
				if (arrayVal[i] < arrayVal[j]) {
					temp = arrayVal[i];
					arrayVal[i] = arrayVal[j];
					arrayVal[j] = temp;
				}
			}

		}
		System.out.println("Second largest number is :" + arrayVal[1]);
		System.out.println("Third largest number is :" + arrayVal[2]);
		
		
		
		int[] array = { 12, 34, 11, 36, 87, 98, 93 };

		// Sorting in descending order without using a temp variable
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		System.out.println("Second largest number is :" + array[1]);
		System.out.println("Third largest number is :" + array[2]);

	}

}
