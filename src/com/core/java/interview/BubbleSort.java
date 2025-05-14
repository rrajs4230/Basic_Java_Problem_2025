package com.core.java.interview;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		for (int i = 0; i < arr.length; i++) {

			boolean isSorted = false;

			for (int j = 0; j < arr.length-1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					isSorted = true;
				}

			}

			if (!isSorted) {

				break;
			}

		}
		
		for (int k = 0; k < arr.length; k++) {
			
			System.out.print(arr[k]+" ");
		}

	}

}
