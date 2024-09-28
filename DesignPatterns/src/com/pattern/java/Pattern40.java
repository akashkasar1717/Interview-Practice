package com.pattern.java;

public class Pattern40 {
	public static void main(String args[]) {
		int i,j,mid=4;
		int cnt =1;
		for(i=0;i<5;i++) {
			int count = cnt;
			
			for(j=0;j<5;j++) {
				if(j <=  mid) {
					System.out.print(count);
					count++;
				}
			}
			System.out.println();
			mid--;
			cnt++;
		}
	}

}
