package com.pattern.java;

public class Pattern70 {
	public static void main(String args[]) {
		
		int i,j,mid=0;
		for(i=0;i<5;i++) {
			for(j=0;j<9;j++) {
				if(j <= mid) {
					System.out.print("*");
				}
			}
			System.out.println();
			mid=mid+2;	
		}
	}

}
