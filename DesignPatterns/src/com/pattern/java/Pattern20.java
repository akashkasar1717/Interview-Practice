package com.pattern.java;

public class Pattern20 {
	public static void main(String args[]) {
		int i,j,mid=4,mid1=5;
		for(i=0;i<9;i++) {
			for(j=0;j<10;j++) {
				if((j<= mid && j <= mid1) || (j>= mid && j >= mid1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i < 4) {
				mid--;
				mid1++;
			}else {
				mid++;
				mid1--;	
			}
		
		}
		
	}

}
