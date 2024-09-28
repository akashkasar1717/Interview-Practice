package com.pattern.java;

public class Pattern75 {
	public static void main(String args[]) {
		int i,j,mid=1,mid1=2;
		for(i=0;i<5;i++) {
			for(j=0;j<12;j++) {
					if( j== mid) {
						System.out.print(" ");
					}
					if(j <= mid1 && j!=mid) {
						System.out.print("*");
					}
				}
			System.out.println();
			mid++;
			mid1=mid1+2;
		
		}
		
		
//	    for (i = 0; i < 5; i++) {
//            for (j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("  ");
//            for (j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
		
		
	}

}
