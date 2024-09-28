package com.alphabetpattern;

public class Pattern127 {
	
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i = 0;i<7;i++) {
			for(j=0;j<7;j++) {
				if(j== 0 || j == 6 || j==mid ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			mid++;
		}
		
	}

}
