package list;
import java.util.*;
public class Listshow {
	public static void main(String args[])
	{
	List<String>li = new ArrayList<>();
	li.add("java");
	li.add("pyhton");
	li.add("DSA");
	System.out.println("Elements of list are");
	for(String s :li)
	{
		System.out.println(s);
	}
	System.out.println("element at index 1:" + li.get(1));
	li.set(1, "js");
	System.out.println("updated list" +li);
	li.remove("DSA");
	System.out.println("list after removoing element" +li);
	
 

}
}
