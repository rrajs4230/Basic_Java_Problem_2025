package com.basic.problem;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		arr = sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] sort(int[] arr) {
		boolean bubble_sort;

		for (int i = 0; i < arr.length - 1; i++) {
			bubble_sort = false;

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] >= arr[j + 1]) {

					int temp = 0;
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					bubble_sort = true;

				}
			}

			if (!bubble_sort) {

				break;
			}

		}

		return arr;
	}

}
