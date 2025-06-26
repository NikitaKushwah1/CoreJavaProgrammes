package set;
import java.util.*;
import java.io.*;
public class Hashset {
	public static void main(String[]args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);
		System.out.println(hs.contains(1));
		System.out.println(hs.remove(2));
		System.out.println(hs);
		Iterator<Integer> it = hs.iterator();   
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(hs.size());
		HashSet cs = new HashSet();
		cs = (HashSet) hs.clone();
		System.out.println(cs);
			
				
		
		hs.clear();
		System.out.println(hs.isEmpty());
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
		set1.retainAll(set2);
		System.out.println("Common Elements: " + set1);

	}

}
