package com.pattern.java;

public class Pattern23 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=4;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(j>=mid && j<=mid1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i < 4) {
				mid++;
				mid1++;
			}else {
				mid--;
				mid1--;
			}
			
		}
		
	}

}
