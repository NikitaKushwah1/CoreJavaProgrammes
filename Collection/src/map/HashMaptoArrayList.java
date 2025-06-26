package map;
import java.util.*;
public class HashMaptoArrayList {
	public static void main(String[]args) {
		HashMap< Integer , String> map = new HashMap<>();
		map.put(1 , "Geek1");
		map.put(2, "Geek 2");
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		ArrayList<String> listvalue = new ArrayList<>(map.values());
		System.out.println("key :"  + list);
		System.out.println("value :"  + listvalue);
		ArrayList<Map.Entry<Integer , String>> listPair = new ArrayList<>(map.entrySet());
		System.out.println( "key -value pair : " +listPair);
		
		
	}

}
