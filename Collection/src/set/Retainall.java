package set;

import java.util.*;

public class Retainall {
	public static void main(String[]args) {
	
	Set<Integer> a = new HashSet<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	System.out.println(a);
	Set<Integer> b = new HashSet<Integer>(); 
	b.add(3);
	b.add(2);
	b.add(1);
	b.add(4);
	System.out.println(a.retainAll(b));	
	System.out.println(a);
	System.out.println(b.size());
	 
	Object[] n = b.toArray();
	 for(Object o :n)
	 {
		 System.out.println(o);
	 }

}
}
