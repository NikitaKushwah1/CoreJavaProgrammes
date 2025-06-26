package array;

import java.util.*;

public class RemoveElement {
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter number for add  ArrayList");
		for(var i = 1;i<6;i++) {
			list.add(i);
		}
		System.out.println("Enter number for remove of ArrayList");
		 var n = sc.nextInt();
		 for(var a = 1;a<list.size();a++) {
			 if(list.get(a)==n){
				 list.set(a, list.get(a+1));
			 }
		}
	 
		System.out.println("After remove element: " + list);
		
		
	}
}