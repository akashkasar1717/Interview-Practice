package com.pattern.java;

public class Pattern48 {
	public static void main(String args[]) {
		int i,j,mid=0;
		int cnt =9;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(j <= mid) {
					System.out.print(cnt);
				}
				
			}
			System.out.println();
			mid++;
			cnt--;
		}
	}

}
