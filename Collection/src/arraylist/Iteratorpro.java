package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorpro {
	public static void main(String[] args) {
 
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
  
	Iterator<Integer> it = list.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
     
}
}

