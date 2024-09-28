package com.pattern.java;

public class Pattern108 {

	public static void main (String args[]) {
		int i,j,mid=0;
		int cnt=1;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(j == mid) {
					System.out.print(cnt);
				}else {
					System.out.print("0");
				}
				
				
			}
			System.out.println();
			mid++;
			cnt++;
		}
	}

}
