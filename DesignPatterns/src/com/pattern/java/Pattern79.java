package com.pattern.java;

public class Pattern79 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=9,mid2=4,mid3=5;
		for(i=0;i<9;i++) {
			for(j=0;j<10;j++) {
				if(i <= 4) {
					if(j > mid && j< mid1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				if( i >= 5) {
					if(j < mid2 || j > mid3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}				
			}
			System.out.println();
			if(i <= 4) {
				mid++;
				mid1--;
			}else {
				mid2--;
				mid3++;
			}
		}
	}

}
