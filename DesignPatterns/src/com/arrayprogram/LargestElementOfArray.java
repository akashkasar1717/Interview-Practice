package com.arrayprogram;

public class LargestElementOfArray {
	public static void main(String[] args) {
		int[] a1 = { 30, 50, 400, 60, 10 };
		int max = a1[0];
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > max) {
				max = a1[i];
			}
		}
		System.out.println("Largest element present in given array: " + max);
	}

}
