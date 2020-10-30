package com.ass4.que6;

import java.util.*;

class InputException extends Exception 
{ 
    public InputException(String str) 
    {    
        super(str); 
    } 
} 

public class Test6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter a number");
		int n = sc.nextInt();
		try {
			if(n > 100) {
				throw new InputException("Number can’t be greater than 100");
			}
			
		} catch (InputException e) {
			System.out.println(e.getMessage());
		}

	}

}
