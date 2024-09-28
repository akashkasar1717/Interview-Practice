package com.arrayprogram;

public class PresentOnEvenPosition {
	public static void main(String[] args) {
		int[] a1 = { 30, 40, 50, 60, 70, 80 };
		System.out.println("Element of an array present on even position:");
		for (int i = 1; i < a1.length; i = i + 2) {
			System.out.println(a1[i] + " ");
		}
	}
}
