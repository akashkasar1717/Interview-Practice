package com.alphabetpattern;

public class Pattern130 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if(i == 0 || i== 5) {
					if(j== 0 || j== 4) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				if(i == 4 ) {
					if(j==0 || j==1 || j== 4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				if(i == 6) {
					if(j == 4 ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if(i != 0 && i != 5  && i != 4 && i != 6 ) {
					if(j  == 0 || j==4) {
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
