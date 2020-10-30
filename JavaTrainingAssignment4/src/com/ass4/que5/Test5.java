package com.ass4.que5;

import java.util.*;

public class Test5 {
	static void checkNumber(int n) throws ArithmeticException {
		try {

			if (n > 100) {
				throw new ArithmeticException("Number can't be greater than 100");
			} else
				System.out.println("Number less than 100");
		} catch (ArithmeticException e) {
			System.out.println("Number can't be greater than 100 exception caught");
		}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		checkNumber(n);
	}
}
