package com.pattern.java;

public class Pattern110 {
	public static void main(String args[]) {
		int i,j,mid=0;
		
		for(i=0;i<5;i++) {
			int cnt=4;
			for(j=0;j<5;j++) {
				if(j >= mid) {
					System.out.print("5");
				}else {
					System.out.print(cnt);
					cnt=cnt-1;
				}
				
			}
			System.out.println();
			mid++;
		}
	}

}
