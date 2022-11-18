package com.johnson.javabasics.practiceassignment.operators;

public class PracticeWithBinary {

	public static void main(String[] args) {

		printBinary();
		shiftLeft(9, 17, 88);
		shiftRight(225, 1555, 32456);

	}

	private static void printBinary() {
		
		//shift left
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x = x << 1);	
		System.out.println();
		
		// Predicted result: binary for 2 is 0010, decimal 4
		
		//shift right
		int y = 150;
		System.out.println(Integer.toBinaryString(y));
		System.out.println(y = y >> 1);	
		System.out.println();
		
		//Predicted result: binary for 150 is 010001110, decimal 71 
	}

 
private static void shiftLeft(int x, int y, int z) {
	   
		System.out.println(x);
	    System.out.println(Integer.toBinaryString(x));
		System.out.println(x = x << 1);	
		
		// Predicted result- binary for 9 is 01001, decimal: 18
		
		System.out.println();
		
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
		System.out.println(y = y << 1);	
		
		// Predicted result: binary for 17 is 010001, decimal 34
		
		System.out.println();
		
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		System.out.println(z = z << 1);	
		
		// Predicted result: binary for 88 is 01011000 decimal 176
		
		System.out.println();
	}

      //225, 1555, 32456

	private static void shiftRight(int x, int y, int z) {
		
		System.out.println(x);
    
		System.out.println(Integer.toBinaryString(x));
	
		System.out.println(x = x >> 1);	
	
		// Predicted result- binary for 255 is 011100001, decimal: 112
	
		System.out.println();
	
		System.out.println(y);
	
		System.out.println(Integer.toBinaryString(y));
	
		System.out.println(y = y >> 1);	
	
		// Predicted result: binary for 1555 is 011000010011, decimal 777
	
		System.out.println();
	
		System.out.println(z);
	
		System.out.println(Integer.toBinaryString(z));
	
		System.out.println(z = z >> 1);	
	
		// Predicted result: binary for 32456 is 0111 1110 1100 1000 decimal 16228
					
	}
}
