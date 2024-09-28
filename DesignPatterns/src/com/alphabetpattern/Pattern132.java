package com.alphabetpattern;

public class Pattern132 {
	public static void main(String srgs[]) {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				if(i == 0 || i == 3 || i==6) {
					System.out.print("*");
				}
				if(i != 0 && i != 3 && i !=6) {
					if( i== 1 || i==2) {
						if(j == 0) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						
					}
					if( i== 4 || i==5) {
						if(j == 4) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						
					}
					
					
				}
				
			}
			System.out.println();
		}
		
	}

}
