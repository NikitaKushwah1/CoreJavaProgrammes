package arraylist;
import java.util.ArrayList;
public class Ensurecapacity {
	  public static void main(String[] args) {
	      ArrayList<Integer> l = new ArrayList<>();
	      l.ensureCapacity(5);
	      for (int i = 1; i <= 5; i++) {
	            l.add(i);
	        }
        System.out.println(l);
        System.out.println(l.size());
	    }
}
