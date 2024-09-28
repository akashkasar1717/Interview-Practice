package com.pattern.java;

public class Pattern71 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=0;
		for(i=0;i<5;i++) {
			int cnt=1;
			for(j=0;j<9;j++) {
				if( j <= mid) {
					System.out.print(cnt);
					if(j < mid1) {
						cnt++;
					}else {
						cnt--;
					}
				}
				
			}
			System.out.println();
			mid=mid+2;
			mid1++;
		}
	}

}
