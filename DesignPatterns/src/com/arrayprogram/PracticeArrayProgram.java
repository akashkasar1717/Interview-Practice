package com.arrayprogram;

public class PracticeArrayProgram {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 40, 4, 3, 50, 90 };
		int temp = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] > a1[j]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		int a = a1[a1.length - 3];
		System.out.print(a + " ");
	}
}
