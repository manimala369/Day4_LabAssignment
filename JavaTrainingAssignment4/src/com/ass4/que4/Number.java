package com.ass4.que4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		try {

			do {
				System.out.println("Please enter a number or enter -1 if u want to quit");
				num = sc.nextInt();
				evenOdd(num);
			} while (num != -1);
			
			
		} catch (InputMismatchException e) {
			System.out.println("you must enter an integer");
		}
		
	}

	private static void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("You have entered an even number");
		} else if(num%2!=0){
			System.out.println("You have entered an odd number");
		} else {
			System.exit(0);
		}

	}

}
