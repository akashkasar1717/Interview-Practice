package com.alphabetpattern;

public class Pattern116 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<6;i++) {
			for(j=0;j<5;j++) {
				if(i == 0 ||  i== 5) {
					if( j > 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}	
				}
				if(i != 0 && i != 5) {
					if(j == 0) {
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
