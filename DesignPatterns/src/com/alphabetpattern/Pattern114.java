package com.alphabetpattern;

public class Pattern114 {

	public static void main(String args[]) {
		int i, j;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				if (i == 0) {
					if (j == 0 || j == 4) {
						System.out.print(" ");
					} else {
						System.out.print(" * ");
					}
				}
				if (i == 3) {
					System.out.print(" * ");

				}
				if (i != 0 && i != 3) {
					if (j == 0 || j == 4) {
						System.out.print(" * ");
					} else {
						System.out.print(" ");
					}

				}
			}
			System.out.println();
		}
		
		
//		for(int i=0;i<7;i++) {
//			for(int j=0;j<5;j++){
//			if(j==0 && i!=0 || j==4 && i!=0 || (i==0 || i==3) && (j!=0 && j!=4) ){
//			System.out.print("*");
//			}else{
//			System.out.print(" ");
//			}
//			}
//			System.out.println();
//			}
		
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<9;j++){
//			if(j-i==0 || j+i==8){
//			System.out.print("*");
//			}else{
//			System.out.print(" ");
//			}
//			}
//			System.out.println();
//			}

	}

}
