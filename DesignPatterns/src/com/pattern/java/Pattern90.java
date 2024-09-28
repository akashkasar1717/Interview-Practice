package com.pattern.java;

public class Pattern90 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if( i == 0 || i==4) {
					System.out.print((char) (80));
				}
				if( i != 0 && i !=4) {
					if(j==0 || j==4) {
						System.out.print((char) (80));
					}else {
						System.out.print((char) (81));
					}
				}
				
			}
			System.out.println();
		}
		
	}
}
