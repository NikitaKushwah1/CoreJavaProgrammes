package map;
 
import java.util.*;
public class MapBasicOperation {
public static void main(String[]args){
	Map<String ,Integer> map = new HashMap<>();
	map.put("Geek1", 1);
	map.put("Geek2", 2);
	map.put("Geek3", 3);
	System.out.println(map);
	System.out.println(map.containsKey(3));
	System.out.println(map.containsKey("Geek1"));
	System.out.println(map.containsValue(3));
	System.out.println(map.entrySet());
	Map<String , Integer> mapping = new HashMap<>();
	mapping.put("Geek4", 1);
	mapping.put("Geek5",2 );
	
	System.out.println(mapping);
	System.out.println(map.equals(mapping));
	System.out.println(map.get("Geek1"));
	System.out.println(map.hashCode());
	System.out.println(map.keySet());
	map.putAll(mapping);
	System.out.println(map);
	map.remove("geek1");
	System.out.println(map.remove("geek1"));
	System.out.println(map.remove("Geek1"));
	System.out.println(map);
	System.out.println(map.size());
	System.out.println(map.values());
	System.out.println(map.putIfAbsent("Geek6" , 7));
	 
		
	
	
	
	 
	
	
}

}
