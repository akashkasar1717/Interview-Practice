package com.alphabetpattern;

public class Pattern135 {
	
	public static void main(String args[]) {
		int i,j,mid=0,mid1=12;
		for(i=0;i<7;i++) {
			for(j=0;j<13;j++) {
				if( j == mid || j == mid1) {
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
