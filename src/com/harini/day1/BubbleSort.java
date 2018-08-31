package com.harini.day1;

public class BubbleSort {
			public static int[] bubbleSort(int[] array) {
			// TODO Auto-generated method stub
			int temp;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array;
		}

	}

