package com.pattern.java;

public class Pattern57 {
	public static void main(String args[]) {
		int i,j,mid=0;
		int count=1;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++ ) {
				if(j <= mid) {
					System.out.print(count + " " );
					count++;
				}
				
			}
			System.out.println();
			mid++;
		}
	}

}
