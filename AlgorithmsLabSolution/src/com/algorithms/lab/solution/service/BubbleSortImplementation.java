package com.algorithms.lab.solution.service;

public class BubbleSortImplementation {
	
	static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] < array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}
		}

	}

}
