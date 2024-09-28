package com.pattern.java;

public class Pattern47 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<9;i++) {
			int cnt =9;
			for(j=0;j<9;j++) {
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
