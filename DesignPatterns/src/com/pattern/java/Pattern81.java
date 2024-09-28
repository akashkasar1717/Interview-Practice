package com.pattern.java;

public class Pattern81 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=9;
		for(i=0;i<5;i++) {
			int cnt=1;
			for(j=0;j<10;j++) {
				if(j > mid && j < mid1) {
					System.out.print(" ");
				}else {
					System.out.print(cnt);
					if(j < mid) {
						cnt++;
					}else if(j >= mid1){
						cnt--;
					}
					
				}
			}
			System.out.println();
			mid++;
			mid1--;
		}
	}

}
