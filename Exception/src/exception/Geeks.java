package exception;

public class Geeks {
	public static void divide(int a , int b) {
		if(b==0) {
		
			throw new DivideByZeroException("Division by zero is not allowed");
		}
			System.out.println("Result :" +(a/b));
		
		}
}
	 


