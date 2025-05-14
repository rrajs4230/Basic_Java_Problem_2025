package com.basic.problem;

import java.util.Arrays;

public class Remove_Specific_Element_arr {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 2, 8, 56 };

		int remEle = 2;
		int count = 0;

		for (int value : arr) {

			if (value != remEle) {

				count++;
			}
		}

		int[] newArr = new int[count];

		int index = 0;
		for (int value : arr) {

			if (value != remEle) {

				newArr[index++] = value;
			}
		}
		System.out.println(Arrays.toString(newArr));

	}

}
