package com.pattern.java;

public class Pattern39 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<5;i++) {
			int cnt =5;
			for(j=0;j<5;j++) {
				if(j <= mid) {
					System.out.print(cnt);
					cnt--;
					
				}
			}
			System.out.println();
			mid++;
		}
	}

}
