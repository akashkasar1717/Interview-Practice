package com.pattern.java;

public class Pattern98 {
	public static void main(String args[]) {
		int i,j,mid=4,mid1=4;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i == 0) {			
				if(j == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				}
				if(i != 0) {
					if(j == mid || j == mid1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
			if( i < 4) {
				mid--;
				mid1++;
			}else {
				mid++;
				mid1--;
			}
		}
	}


}
