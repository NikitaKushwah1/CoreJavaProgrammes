package StringBuffer;

public class Stringbuffer1 {
	 
	    public static void main(String[] args){
	      
	      	  StringBuffer s = new StringBuffer();
	          s.append("Hello");
	          s.append(" ");
	          s.append("world");
	       	String str = s.toString();
	       	String st = s.substring(2,4);
	       	System.out.println(st);
	        System.out.println(str);
	    }
	}

