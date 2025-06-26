package list;
import java.util.*;

public class Index {

	public static void main(String[]args)
	{  
		List<Integer> a1 = new ArrayList<>();
	   for(int i = 0;i<5;i++)
	   {  
		   a1.add(i);
	   }
	   System.out.println(a1);
	   int k = a1.indexOf(2);
	   System.out.println("First Occurrence of 2 is at index" + k);
	   int l = a1.lastIndexOf(4);
	   System.out.println("last occurrenc of 4 is at index" +l);
	   a1.remove(3);
	   System.out.println("remove" + a1);
		for(int j = 0;j<a1.size();j++)
		{
			System.out.println(a1.get(j));
		}
		System.out.println(a1.contains(3));
	}
}
