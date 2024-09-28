package com.alphabetpattern;

public class Pattern136 {
	public static void main(String args[]) {
		int i,j,mid=3,mid1=3;
		for(i=0;i<4;i++) {
			for(j=0;j<7;j++) {
				if(j==0 || j== 6 || j == mid || j == mid1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			mid--;
			mid1++;
			
		}
		
		
	}

}
