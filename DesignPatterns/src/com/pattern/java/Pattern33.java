package com.pattern.java;

public class Pattern33 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<6;i++) {
			int cnt=5;
			for(j=0;j<6;j++) {
				if(j <= mid) {
					System.out.print((char) (cnt+65));
					cnt--;
				}
				
			}
			System.out.println();
			mid++;
		}
	}

}
