package com.pattern.java;

public class Pattern111 {
	public static void main(String args[]) {
		int i,j,mid=0;
		int cnt1=5;
		for(i=0;i<5;i++) {
			int cnt=5;
			
			for(j=0;j<5;j++) {
				if(j<=mid) {
					System.out.print(cnt);
					cnt--;
				}else {
					System.out.print(cnt1);
				}
				
			}
			System.out.println();
			mid++;
			cnt1--;
			

		}
	}

}
