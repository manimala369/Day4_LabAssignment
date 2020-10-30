package com.ass4.que1;

import java.io.*;

public class CharacterBufferQue2 {

	public static void main(String[] args) {
		try
		{
		BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
		String para = "";
		
			para = bfrd.readLine();
			BufferedWriter bfwd = new BufferedWriter(new FileWriter("inputfile2.txt"));
			bfwd.write(para);
			System.out.println("data was written to file ");
			bfwd.close();
			bfrd.close();
		}
		catch(IOException e) {
			System.out.println("exception caught");
		}

	}

}
