package com.alphabetpattern;

public class Pattern126 {
	 
	public static void main(String args[]) {
		int i,j,mid=0,mid1=6;
		for(i=0;i<7;i++) {
			for(j=0;j<7;j++) {
				if(j== 0 || j == 6 || j== mid || j == mid1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if( i < 3 ) {
				mid++;
				mid1--;
			}else {
				mid=0;
				mid1=6;
			}
			
		}
		
	}
}
