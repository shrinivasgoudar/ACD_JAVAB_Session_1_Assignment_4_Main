/**
 * 
 */
package com.acadgild;

/**
 * @author shrinivasa.goudar
 *
 */
public class ArithmaticOperationProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Arithmatic Operation  Program!!!");
		// Declaration of variables
		// Datatype variable1, variable2 , variable3;
		int x, y, result;
		// Assigning the int value to x variable
		x = 5;
		// Assigning the int value to y variable
		y = 10;
		// Addition and multiplication Operation
		result = x + y * 2;
		System.out.println("Result of x+y*2 expression is :" + result);

		// Subtraction and Addition Operation
		result = x - y + 2;
		System.out.println("Result of x - y + 2 expression is :" + result);
		
		// Addition and multiplication Operation
		result = (x + y) * 2;
		System.out.println("Result of (x+y)*2 expression is :" + result);

		// Modulus Operation
		result = y % x;
		System.out.println("Result of y % x expression is :" + result);

	}

}
