package com.alphabetpattern;

public class Pattern139 {
	
	public static void main(String args[]) {
		int i,j,mid=6;
		for(i=0;i<7;i++) {
			for(j=0;j<7;j++) {
				if(i==0 || i == 6) {
					System.out.print("*");
				}
				if(i !=0 && i != 6) {
					if( j == mid) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
			mid--;
		}
		
	}

}
