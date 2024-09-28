package com.arrayprogram;

public class DuplicateElementOfArray {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 2, 10, 30, 10, 44, 55, 55 };
		System.out.println("Duplicate elements in given array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
