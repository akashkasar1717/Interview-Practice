package com.pattern.java;

public class Pattern15 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i < 5) {
					if(j >= mid && j < 5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}else {
					if(j>=4 && j<=mid) {
						System.out.print("*");

					}else {
						System.out.print(" ");

					}
					
				}
				
			}
			System.out.println();
			mid++;
				
			
			
		}
		
	}

}
