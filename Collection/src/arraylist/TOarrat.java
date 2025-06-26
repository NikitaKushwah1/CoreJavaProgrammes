package arraylist;
import java.util.*;
public class TOarrat {
	public static void main(String[]args)
	{
		List<Integer>a1 = new ArrayList<Integer>();
	    a1.add(10);
	    a1.add(20);
	    a1.add(30);
	    Integer[]arr = new Integer[a1.size()];
	    arr = a1.toArray(arr);
	    for(Integer x :arr)
	    {
	    	System.out.println(x + "");
	    }
	
	

}
}