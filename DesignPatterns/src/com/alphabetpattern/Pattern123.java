package com.alphabetpattern;

public class Pattern123 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if(i == 0) {
					System.out.print("*");
				}
				if(i >= 1 && i <= 4) {
					if(j == 2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				if(i == 5) {
					if( j ==0 || j==2 ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				if(i == 6) {
					if( j< 3 ) {
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
