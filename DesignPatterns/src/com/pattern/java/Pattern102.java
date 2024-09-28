package com.pattern.java;

public class Pattern102 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=4;
		for(i=0;i<5;i++) {
			for(j=0;j<9;j++) {
				if(i == 0) {
					if(j <=4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if(i == 4) {
					if(j >=4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if(i != 0 && i != 4) {
					if(j == mid || j== mid1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			mid++;
			mid1++;
		}
	}

}
