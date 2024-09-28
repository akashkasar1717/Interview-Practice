package com.pattern.java;

public class Pattern03 {
	public static void main(String arg[]) {
		int i,j,mid=0;
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(j <= mid) {
					System.out.print("*");
				}
			}
			System.out.println();
			mid++;
		}
		
		
	}

}
