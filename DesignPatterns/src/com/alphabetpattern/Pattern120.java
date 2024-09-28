package com.alphabetpattern;

public class Pattern120 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j< 6;j++) {
				if( i == 0 || i == 6) {
					if( j == 5) {
						System.out.print(" ");
					}else {
					System.out.print("*");
					}
				}
			
				if(i == 1 || i == 2) {
					if(j == 0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if( i == 3) {
					if(j== 1 || j==2) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
					
				}
				if(i == 4 || i == 5) {
					if(j == 0 || j == 4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
		
	}

}
