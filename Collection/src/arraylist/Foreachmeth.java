package arraylist;
import java.util.*;
public class Foreachmeth {
	public static void main(String[]args)
	{
		ArrayList<String> l = new ArrayList<>();
		 l.add("cherry");
		 l.add("Blueberry");
		 l.add("straberry");
		 l.forEach(System.out::println);
		 
		 ArrayList<Integer> n = new ArrayList();
		 n.add(2);
		 n.add(3);
		 n.add(4);
		 n.forEach(n1 -> System.out.println(n1*n1));
	
	
	     ArrayList<Integer> a = new ArrayList<>();
	      a.add(24);
	      a.add(45);
	      a.add(10);
	     a.forEach(age -> {
		  if(age>=18) {
			  System.out.println("Eligible age:" +age);
		  }
			  
	 });
//	 a.removeRange(1,2);
//	 
	 a.removeIf(n2 -> (n2%3==0));
      
     System.out.println(a);
     
	

}
}
