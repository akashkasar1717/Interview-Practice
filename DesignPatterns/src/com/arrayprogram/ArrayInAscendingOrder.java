package com.arrayprogram;

public class ArrayInAscendingOrder {
	public static void main(String[] args) {
		int[] a = { 5, 2, 1, 6, 7, 11 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
