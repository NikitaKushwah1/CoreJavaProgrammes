package arraylist;
import java.util.*;
public class Hetro {
public static void main(String[]args)
{
	ArrayList list = new ArrayList<Integer>();
	list.add("a");
	list.add(1);    // works
//	list.add(new Object());  // works
   System.out.println(list);
   System.out.println(list);
}
}
