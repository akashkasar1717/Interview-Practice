package com.pattern.java;

public class pattern02 {

	public static void main(String args[]) {
		int i, j;
		int mid = 5;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (j < mid) {
					System.out.print("* ");
				}
			}
			System.out.println();
			mid--;
		}
	}
}
