package com.pattern.java;

public class Pattern28 {
	public static void main(String args[]) {
		int i,j,mid=0;
		for(i=0;i<9;i++) {
			int cnt=0;
			for(j=0;j<5;j++) {
				if(j <=  mid) {
					System.out.print((char) (cnt+65));
					cnt++;
				}
				
				
			}
			System.out.println();
			if(i < 4) {
				mid++;
			}else {
				mid--;
			}
			
		}
	}

}
