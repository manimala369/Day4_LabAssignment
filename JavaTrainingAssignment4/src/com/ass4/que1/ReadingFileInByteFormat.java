package com.ass4.que1;

import java.io.*;

public class ReadingFileInByteFormat {

	public static void main(String[] args){
	
		FileInputStream finst=null;
		try {
			 finst = new FileInputStream("inputfile.txt");
			int line = 0;

			while ((line = finst.read()) != -1) {
				System.out.print((char) line);
			}
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
		try{
			finst.close();
		} 
		catch (IOException ex){
			ex.printStackTrace();}
	}
}

		