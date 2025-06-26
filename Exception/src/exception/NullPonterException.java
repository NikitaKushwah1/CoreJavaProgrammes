package exception;

import java.io.*;


public class NullPonterException {
	// Importing Files/Classes
	 
	 

	       public static void main(String[] args)
	    {
	        
	        String m = null;

	       
	        try {
	          
	            
	            if (m.equals("GFG")) {
	                 
	                System.out.println("YES");
	            }
	        }

	         
	        catch (NullPointerException e) {

	            
	            System.out.println(
	                "Object reference cannot be null");
	        }
	    
	}
}
