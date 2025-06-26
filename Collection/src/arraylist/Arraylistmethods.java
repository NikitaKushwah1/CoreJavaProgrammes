package arraylist;
import java.util.ArrayList;
 
public class Arraylistmethods {
	public static void main(String[]args)
	{   
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Geeks");
		a1.add("Geeks");
		System.out.println("Original list"  + a1);
		a1.add(1,"For");
		System.out.println("After Adding element at index 1" + a1);
		a1.remove("Geeks");
		a1.set(0,"GfG");
		System.out.println(a1);
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("java");     
        a1.addAll(1,a2);
        System.out.println(a1);
        
//        a1.clear();
//        System.out.println(a1);
        
        for(String l : a1)
        {
        	System.out.println(l);
        	 
        }
         
        for(int i = 0;i<a1.size();i++)
        {
        	System.out.println(a1.get(i));
        }
        System.out.println(a1.contains("java"));
        boolean r=a1.removeAll(a2);
        
      System.out.println(r);

        
	}

}

