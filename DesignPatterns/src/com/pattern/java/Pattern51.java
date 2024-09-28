package com.pattern.java;

public class Pattern51 {
	public static void main(String args[]) {
		int i,j,mid=4,mid1=4;
		int cnt=1;
		for(i=0;i<9;i++) {
			for(j=0;j<5;j++) {
				if( j >= mid && j<= mid1) {
					System.out.print(cnt+ " ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i < 4) {
				mid--;
				mid1++;	
				cnt++;
			}else {
				mid++;
				mid1--;
				cnt--;
			}
			
		}
	}

}
