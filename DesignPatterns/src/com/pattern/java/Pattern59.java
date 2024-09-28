package com.pattern.java;

public class Pattern59 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<9;i++) {
			int cnt =1;
			for(j=0;j<5;j++) {
				if(j >= mid) {
					System.out.print(cnt);
					cnt++;
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i <= 3) {
				mid++;
			}else if(i >= 4) {
				mid--;
			}
		}
	}

}
