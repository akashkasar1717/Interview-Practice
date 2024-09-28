package com.pattern.java;

public class Pattern100 {
	public static void main (String args[]) {
		int i,j,mid=4;
		for(i=0;i<9;i++) {
			for(j=0;j<5;j++) {
				if(j == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				if(j != 4) {
					if(j == mid) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
			if(i < 4) {
				mid--;
			}else {
				mid++;
			}
		}
		
	}

}
