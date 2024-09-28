package com.pattern.java;

public class Pattern112 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=6;
		for(i=0;i<5;i++) {
			for(j=0;j<7;j++) {
				if(i == 0) {
					if(j== 0 || j==3 || j==6) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				if(i == 1) {
					if(j == 0 || j == 3 || j == 6) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if(i == 4) {
					if( j == 3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				if(i != 0  && i !=1  && i !=4) {
					if(j==mid || j ==mid1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
			mid++;
		}
		
		
//		   for (i = 0; i < 5; i++) {
//	            for (j = 0; j <= i; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.print("  ");
//	            for (j = 0; j <= i; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
	}

}
