package com.alphabetpattern;

public class Pattern138 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=6;
		for(i=0;i<7;i++) {
			for(j=0;j<7;j++) {
				if( i <= 2) {
					if(j == mid || j == mid1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
				if( i  >= 3) {
					if( j == 3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
			if(i < 2) {
				mid++;
				mid1--;
			}
		}
		
	}

}
