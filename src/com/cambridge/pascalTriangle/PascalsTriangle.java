package com.cambridge.pascalTriangle;



public class PascalsTriangle {

	
	public static int num1 ( int a ) {
		
		int i;
		
		for (i = 1; a > 1 ; a--) {
			i *= a;
		}
		
		return i;
	}
	
	public static int num2 ( int a, int b) {
		
		return num1(a) / (num1(a-b) * num1(b));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println();
		
		int a, x , y;
		a = 4;
		
		for ( x = 0; x <= a ; x++) {
			for ( y = 0;  y <= a-x; y++) {
				System.out.print(" ");
			}
				for ( y = 0; y <= x; y++) {
					System.out.print(" " + num2(x,y));
				}
				System.out.println();
		}
	
	}

}
