package com.johnson.javabasics.practiceassignment.operators;

public class PracticeWithBitwiseAndOr {

	public static void main(String[] args) {
		
		calcBitwiseAndOr ();
		calcPrefixPostfix ();
		calcSum ();

	}

	private static void calcBitwiseAndOr() {
		
		int x;
		int y;
		int z;
		
		x = 7;
		y = 17;
		
		// Prediction for 0111 & 010001 is 0001 or 1
		
		z = x & y;
		
		System.out.println(z);
		
		// Prediction for 0111 | 010001 is 010111 or 23
		
		z = x | y;
		
		System.out.println(z);
		System.out.println();
		
	}
	
	private static void calcPrefixPostfix() {
		
		int x = 0;
<<<<<<< HEAD
		
		System.out.println("x starts at " + x);
				
		System.out.println("after one postfix increment x is " + x++);
		
		System.out.println("after two postfix increments x is " + x++);
		
		System.out.println("after a prefix increment x is " + ++x);
		
		System.out.println("after a postfix decriment x is " + x--);

		System.out.println("after a prefix decriment x is " + --x);
		 
		System.out.print("x minus equals 1 prints: ");
		System.out.println(x-=1);
		
		System.out.println();
=======
				
		System.out.println(x++);
		
		System.out.println(x++);
		
		System.out.println(++x);
		
		System.out.println(x--);

		System.out.println(--x);
		
		System.out.println(x+=x);
		
		System.out.println(x-=1);
>>>>>>> 1d0b14b9b7049a25f9c205cd15431b9425f0c0a7
		
	}
	
	private static void calcSum() {
		
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		
		System.out.println(sum);
		
		x=5;
		sum = x++ + y;
		
		System.out.println(sum);
		
	}
}
