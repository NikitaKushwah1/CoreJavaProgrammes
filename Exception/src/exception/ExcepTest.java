package exception;

public class ExcepTest {
	
	public static void main(String args[]) {
		int a = 3;
		int b = 0;
		try {
			System.out.println("Result :" + divide(a,b));
			
		}
		
		catch(Exception e ) {
			System.out.println(" Exception :" + e);
			
		}
		
	}
		
		public static int divide(int a , int b) throws Exception {
			if(b == 0) {
				throw new Exception("Second argument can not be zero");
				
			}
		return a/b;
		
	}

}
