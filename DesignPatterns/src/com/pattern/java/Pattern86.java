package com.pattern.java;

public class Pattern86 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
			if( j == mid) {
				System.out.print((char) (79));
			}else {
				System.out.print((char) (88));				
			}
				
			}
			System.out.println();
			mid++;
		}
	}

}
