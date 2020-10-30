package com.ass4.que7;

import java.io.IOException;

class ExceptionHandling {
	
	public void throwException() throws InputException, IOException {		
	}

}

public class Test7 {

	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling();
		try {
			eh.throwException();
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
