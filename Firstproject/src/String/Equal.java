package String;

public class Equal {
	 
		  public static void main(String[] args) {
		    String str1 = "Learn Java";
		    String str2 = "Learn Kolin";
		    int result;

		    
		    result = str1.compareTo(str2);

		    System.out.println(result);
		   
		            String str = "Learn Java";
		            String st= "learn java";
		            String s = "Learn Kolin";
		            Boolean res;

		             
		            res= str.equalsIgnoreCase(st);
		            System.out.println(result);  
 
		            res = str.equalsIgnoreCase(s);
		            System.out.println(result);  

		          
		            res = s.equalsIgnoreCase(str);
		            System.out.println(result);  
		        }
		    
		}
 