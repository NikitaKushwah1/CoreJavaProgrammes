package set;
import java.util.*;
public class Union {
public static void main(String[]args){
	HashSet<Integer> hs = new HashSet<>();
	HashSet<Integer> s = new HashSet<>();
	for(int i = 0 ;i<5;i++) {
		hs.add(i);
	}
		System.out.println(hs);
	
	for(int i = 2;i<12;i++) {
		s.add(i);
	}
	System.out.println(s);
	hs.addAll(s);
	System.out.println(hs);
	hs.retainAll(s);
	System.out.println(hs);
	
	
}
}
