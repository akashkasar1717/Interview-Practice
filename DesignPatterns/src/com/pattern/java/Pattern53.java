package com.pattern.java;

public class Pattern53 {
	public static void main(String args[]) {
		int i,j,mid=8,mid1=8;
		int cnt=1;
		for(i=0;i<9;i++) {
			int count =cnt;
			for(j=0;j<9;j++) {
					if( j >= mid && j<= mid1) {
						System.out.print(count+ " ");
						count++;
					}else {
						System.out.print(" ");
					}	
			}
			System.out.println();
			mid--;
			mid1++;
			
		}
		
	}

}
