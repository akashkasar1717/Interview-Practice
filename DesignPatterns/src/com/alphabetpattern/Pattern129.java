package com.alphabetpattern;

public class Pattern129 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if(i == 0) {
					if(j== 0 || j == 4) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				if(i == 3) {
					if(j == 4) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				if(i != 0 && i!=3) {
					if(i == 1 || i== 2) {
						if(j == 0 || j== 4) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					if(i == 4 || i== 5 || i== 6) {
						if(j == 0 ) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				
					
				}
			}
			System.out.println();
		}
		
	}

}
