package com.pattern.java;

public class Pattern78 {
	public static void main(String args[]) {
		int i,j,mid=0,mid1=5,mid2=9,mid3=10,mid4=14 ,mid5=19;
		for(i=0;i<5;i++) {
			for(j=0;j<20;j++) {
				if((j > mid  && j < mid1) || (j > mid2  && j < mid3) || (j > mid4 && j < mid5)  ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			
				
				
			}
			System.out.println();
			mid++;
			mid2--;
			mid3++;
			mid5--;
		}
	}

}
