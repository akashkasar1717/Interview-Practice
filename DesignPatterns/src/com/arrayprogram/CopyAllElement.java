package com.arrayprogram;

public class CopyAllElement {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40 };
		int[] array2 = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		for (int i : array2) {
			System.out.print(i + " ");
		}
	}
}
