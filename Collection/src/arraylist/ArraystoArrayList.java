package arraylist;
import java.util.*;
public class ArraystoArrayList {
 public static void main(String[]args) {
	 int[]arr = {1,2,3,4};
	 ArrayList<Integer> a1 = new ArrayList<>();
	 for(int i = 0;i<arr.length;i++) {
		 a1.add(arr[i]);
		 
		 
	 }
	 System.out.println(a1);
 }
}
