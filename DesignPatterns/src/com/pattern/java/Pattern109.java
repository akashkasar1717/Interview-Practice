package com.pattern.java;

public class Pattern109 {
	public static void main(String args[]) {
		int i,j,mid=4;
		int cnt=1;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(j >= mid) {
					System.out.print(cnt);
				}else {
					System.out.print("1");
				}
				
			}
			System.out.println();
			mid--;
			cnt++;
		}
	}

}
