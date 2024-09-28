package com.pattern.java;

public class Pattern95 {

	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(i == 0) {
					System.out.print("*");
				}
				if(i != 0) {
					if( j == 4 || j == mid) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
			mid++;
		}
	}
}
