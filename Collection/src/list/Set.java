package list;
import java.util.*;


public class Set {
	public static void main(String[]args)
	{
		List<String> a1 = new ArrayList<>();
		a1.add("Gekks");
		a1.add("Geeks");
		a1.add(1,"Geeks");
		System.out.println("Intial ArrayList" + a1);
		a1.set(1, "For");
		System.out.println("Updated ArrayList" +a1);
		a1.remove(0);
		System.out.println(a1);
		System.out.println(a1.get(1));
		System.out.println(a1.contains("Geeks"));
		
	}

}
