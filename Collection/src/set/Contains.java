package set;
import java.util.*;
public class Contains {
	public static void main(String[]args) {
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i = 0;i<5;i++) {
			System.out.println(hashSet.add(i));
		}
		  
		HashSet<Integer> Set = new HashSet<>();
		for(int i = 0;i<5;i++) {
			System.out.println(Set.add(i));
		}

		 int c = 0;
		 for(Integer i : hashSet) {
			 for(Integer j : Set) {
				 if(hashSet.contains(i)==Set.contains(j)) {
					 c++;
					 break;
				 }
			 }
		 }
		 boolean res = false;
		 if(hashSet.size() == Set.size() && c == hashSet.size()) {
			  res = true;
		 }
         System.out.println(res);
		 
		  
 }
}
	
	

 