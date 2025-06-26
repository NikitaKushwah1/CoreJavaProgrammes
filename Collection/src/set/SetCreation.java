package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

public class SetCreation {
	public static void main(String args[]) 
    {
        Set<String> set = new HashSet<>();
        System.out.println("Setcreation Elements: " + set);
        set.add("Welcome");
        set.add("To");
        set.add("set");
        System.out.println("Setcreation Elements: " + set);
        Set<String> s1 = new HashSet<>();
        s1.add("java");
        s1.add(" python");
        set.addAll(s1);
        System.out.println("Setcreation Elements: " + set);
        System.out.println("Setcreation Elements: " + set.contains("python"));
        System.out.println("Setcreation Elements: " + set.containsAll(s1));
        System.out.println(set.hashCode());
        System.out.println(set.isEmpty());
        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
        	   System.out.println(it.next());
               
        }
        System.out.println(set.remove("set"));
        System.out.println(set);
        System.out.println(set.removeAll(s1));
        System.out.println(set);
        
        
        
        
        
        
    }
}
