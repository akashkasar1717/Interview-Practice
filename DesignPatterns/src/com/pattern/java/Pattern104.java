package com.pattern.java;

public class Pattern104 {
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<5;i++) {
			
			for(j=0;j<5;j++) {
				if(j == 1 || j == 3) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				
			}
			System.out.println();
			
		}
	}

}
