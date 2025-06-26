package exception;

public class M {
	public static void main (String args[]) {
		try {
			Geeks.divide(10,0);
			
		}
		catch(DivideByZeroException e) {
			System.out.println("Caught Exception :" + e.getMessage());
		}
		
	}
	}

