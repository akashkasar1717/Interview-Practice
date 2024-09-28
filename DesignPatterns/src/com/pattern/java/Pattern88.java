package com.pattern.java;

public class Pattern88 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=4;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(j == mid || j == mid1) {
					System.out.print((char) (65));
				}else {
					System.out.print((char) (66));
				}
				
			}
			System.out.println();
			mid++;
			mid1--;
		}
		
	}

}
