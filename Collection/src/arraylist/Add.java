package arraylist;
import java.util.ArrayList;

public class Add {
	public static void main(String[]args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		 
		System.out.println(list);
		ArrayList<Integer> listdata = new ArrayList<Integer>();
		listdata.add(3);
		listdata.add(2);
		listdata.add(1);
		listdata.add(1);
		
		 System.out.println(list.containsAll(listdata));
		
		int count = 0;
		for(int i = 0;i<list.size();i++)
		{
			for(int j = 0;j<listdata.size();j++)
			{
				if(list.get(i)==listdata.get(j))
				{
					count++;
					 break;
				}
			}
		}
		boolean res = false ;
//		if (a.size() == b.size() && count == a.size())
//		{
//			res = true;
//		}
		if(count == list.size() || count == listdata.size()){
			res = true;
			
		}
		System.out.println(res);
		
		
		
		  
}
	}