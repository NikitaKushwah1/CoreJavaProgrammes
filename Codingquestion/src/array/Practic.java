package array;
import java.util.*;
public class Practic {
 public static void main(String[]args) {
	 String s = "i love java very very much";
	Map<String,Integer> map = new LinkedHashMap<>();
	 String[] test = s.split("\\s+");

	 for(String n: test) {   
		 map.put(n , map.getOrDefault(n, 0)+1);
	 }
	 System.out.println(map);
	 
 }
	
}
