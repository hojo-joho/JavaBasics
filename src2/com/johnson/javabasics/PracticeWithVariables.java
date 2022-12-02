package com.johnson.javabasics;

public class PracticeWithVariables {

	public static void main(String[] args) {

		sumTwoInts();

		sumTwoDoubles();
		
		sumTwoNums();

		divideTwoInts();
		
		divideTwoInts2();
		
		divideTwoDoubles();
		
		divideTwoDoubles2();
		
		playWithCasting();
		
		playWithConst();
		
		totalCoffeeOrder();
	}

	public static void sumTwoInts() {

		int num1 = 123;
		int num2 = 321;
		int sum = num1 + num2;

		System.out.println(sum);

	}

	public static void sumTwoDoubles() {

		double num1 = 1.23;
		double num2 = 32.1;
		double sum = num1 + num2;

		System.out.println(sum);

	}

	public static void sumTwoNums() {

		int num1 = 100;
		double num2 = 0.001;
		double sum = num1 + num2;

		System.out.println(sum);

	}
	
	public static void divideTwoInts() {

		int num1 = 123;
		int num2 = 321;
		int result = num2/num1;

		System.out.println(result);

	}	
	
	public static void divideTwoInts2() {

		int num1 = 123;
		double num2 = 321.321;
		double result = num2/num1;

		System.out.println(result);

	}	
	
	public static void divideTwoDoubles() {

		double num1 = 1.2;
		double num2 = 32.1;
		double result = num2/num1;

		System.out.println(result);

	}
	
	public static void divideTwoDoubles2() {

		double num1 = 1.2;
		double num2 = 32.1;
		double result = (int) num2/num1;

		System.out.println(result);

	}
	
	public static void playWithCasting() {

		int x = 5;
		int y = 6;
		double q = x/y;

		System.out.println(q);
		
		q = (double) y;
		
		System.out.println(q);
	}	
	
	public static void playWithConst() {

		final int NUM_ONE = 5;
		int q = NUM_ONE*100;

		System.out.println(q);
	}	

	public static void totalCoffeeOrder() {

		double latte = 3.65;
		double americano = 1.99;
		double affogato = 4.38;
		
		coffeeOrder(latte, americano, affogato);

	}
	
	public static void coffeeOrder(double x, double y, double z) {
		
		double subtotal;
		double totalSale;
		final double SALES_TAX = 0.07;
		
		subtotal = 3*x+4*y+2*z;
		totalSale = subtotal+subtotal*SALES_TAX;
		
		System.out.println(String.format("Your total today is $" + "%.2f", totalSale));
		System.out.printf("Your total today is %.2f. Thanks, see you soon!", totalSale);
	}
}
