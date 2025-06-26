package exception;

public class Cal {
	 public static void divide(int n , int d) {
		 try {
			 int r = n/d;
			 System.out.println("Division result :" + r);
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Error cannot divide by zero !" +e.getMessage());
		 }
	 }

}
