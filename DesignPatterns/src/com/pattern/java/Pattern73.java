package com.pattern.java;

public class Pattern73 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=0;
		int cnt=0;
		for(i=0;i<5;i++) {
			int count = cnt;
			for(j=0;j<9;j++) {
				if(j <= mid) {
					System.out.print((char) (count+65));
					if( j < mid1) {
					count++;
					}else {
						count--;
					}
				}
				
			}
			System.out.println();
			mid=mid+2;
			mid1++;
		}
	}

}
