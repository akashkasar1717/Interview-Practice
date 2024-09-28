package com.pattern.java;

public class Pattern91 {
	public static void main(String args[]) {
		int i,j,mid=4;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(j == mid) {
					System.out.print((char) (78));
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			mid--;
		}
	}

}
