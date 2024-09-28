package com.pattern.java;

public class Pattern49 {
	public static void main(String args[]) {
		int i,j,mid=8,mid1=8;
		for(i=0;i<9;i++) {
			int cnt=1;
			for(j=0;j<9;j++) {
				if( j >=mid && j<= mid1) {
					System.out.print(cnt);
					cnt++;	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			mid--;
			mid1++;
		}
		
	}

}
