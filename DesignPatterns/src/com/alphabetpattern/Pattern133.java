package com.alphabetpattern;

public class Pattern133 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if(i==0) {
					System.out.print("*");
				}
				if(i !=0) {
					if( j == 2) {
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
