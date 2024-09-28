package com.pattern.java;

public class Pattern12 {
	
	public static void main(String args[]) {
		int i,j,mid=0,mid1=8;
		for(i=0;i<5;i++) {
			for(j=0;j<9;j++) {
				if(j >= mid && j <= mid1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			mid++;
			mid1--;
		}
	}

}
