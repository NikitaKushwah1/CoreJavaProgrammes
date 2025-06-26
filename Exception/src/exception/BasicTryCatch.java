package exception;

public class BasicTryCatch {
	
	public static void main(String[]args) {
		Cal calc = new Cal();
		System.out.println("Basic try -catch example");
		calc.divide(10,2);
		calc.divide(10, 0);
		
	}

}
