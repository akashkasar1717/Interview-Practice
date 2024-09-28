package com.alphabetpattern;

public class Pattern134 {
	
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if( i != 6) {
					if( j == 0 || j==4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if( i == 6) {
					if( j == 0 || j==4) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
		}
		
	}

}
