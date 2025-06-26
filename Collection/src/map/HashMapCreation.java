package map;
import java.util.*;
public class HashMapCreation {
	public static void main(String[]args) {
		HashMap<String , Integer> hashMap = new HashMap<>();
		hashMap.put("john", 25);
		hashMap.put("jane", 30);
		hashMap.put(null, 2);
		hashMap.put(null , 1);
		System.out.println(hashMap);
//		hashMap.remove("jane");
//		System.out.println(hashMap);
		for(Map.Entry<String , Integer> e: hashMap.entrySet())
			System.out.println("Key:" + e.getKey() +   "  value:" + e.getValue());
	    HashMap<String , Integer> hashClone = (HashMap<String , Integer>)hashMap.clone();
	    System.out.println(hashClone);
 	}
	}
