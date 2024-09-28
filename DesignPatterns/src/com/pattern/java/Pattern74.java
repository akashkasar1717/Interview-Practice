package com.pattern.java;

public class Pattern74 {
	public static void main(String args[]) {
		int i,j,mid=4,mid1=4,mid2=4;
		for(i=0;i<5;i++) {
			int cnt=0;
			for(j=0;j<9;j++) {
				if(j >= mid && j <= mid1) {
					System.out.print((char) (cnt+65));
					if( j < mid2) {
						cnt++;
						}else {
							cnt--;
						}
					
				}else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
			mid--;
			mid1++;
		}
	}

}
