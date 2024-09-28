package com.pattern.java;

public class Pattern54 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=16;
		int cnt=9;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(j>=mid && j<= mid1) {
					System.out.print(cnt + " ");
				}else {
					System.out.print(" ");
				}			
			}
			System.out.println();
			mid++;
			mid1--;
			cnt--;
		}
	}

}
