package exception;

import java.io.*;

public class Trycatch {
	public static void main(String[]args) {
		try {
			int res = 10/0;
			String s = null;
			System.out.println(s.length());
		}
		catch (ArithmeticException e) {
			System.out.println("exception caught : " +e);
			
		}
		catch(NullPointerException e){
			System.out.println("caught NullPointerException:"  + e);
		}
		System.out.println("I will always execute");
		
	}

}
