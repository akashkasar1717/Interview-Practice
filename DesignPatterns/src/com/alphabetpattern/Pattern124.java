package com.alphabetpattern;

public class Pattern124 {

	public static void main(String args[]) {
//		int i,j;
//		for(i=0;i<7;i++) {
//			for(j=0;j<5;j++) {
//				if(i == 0) {
//					if(j == 0 || j == 4 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				if(i==1) {
//					if(j == 0  || j == 3 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				
//				if(i==2) {
//					if(j == 0  || j == 2 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				if(i==3) {
//					if(j == 0  || j == 1 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				if(i==4) {
//					if(j == 0  || j == 2 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				if(i==5) {
//					if(j == 0  || j == 3 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				if(i==6) {
//					if(j == 0  || j == 4 ) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				
//			}
//			System.out.println();		
//		}
		
		int i,j,mid=4;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if(j == 0 || j== mid) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i < 3) {
				mid--;
			}else {
				mid++;
			}
		}
		
	}
}
