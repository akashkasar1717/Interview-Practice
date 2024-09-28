package com.arrayprogram;

public class SmallestElementOfArray {
	public static void main(String[] args) {
		int[] a1 = { 1, 7, 8, 9, 50, 600, 90 };
		int min = a1[0];
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] < min) {
				min = a1[i];
			}
		}
		System.out.println("Smallest element present in given array: " + min);
	}
}
