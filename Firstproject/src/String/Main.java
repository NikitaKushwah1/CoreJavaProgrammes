package String;

class Main {
	  public static void main(String[] args) {
	    String str1 = "Learn Java";
	    String str2 = "Learn Java";
	    String str3 = "Learn Kolin";
	    int result;

	    
	    result = str1.compareTo(str2);

	    System.out.println(result);   

	    
	    result = str1.compareTo(str3);

	    System.out.println(result);  

	     
	    result = str3.compareTo(str1);

	    System.out.println(result);   
	  }
	}