package array;

import java.util.*;

public class Arr {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number for remove of ArrayList");
	 var n = sc.nextInt();
   var c =0;
	int a[] = {1,2,3,4,5};
	for(int i =0;i<a.length;i++) {
		if(a[i] == n) {
			 c++;
		}}
		int res[] = new int[a.length-c];
		int index = 0;
		 for(var num : a) {
			 if(num!=n) {
				 res[index++]=num;
				 
			 }
		 }
	
	 
	System.out.println("Updated array: " + Arrays.toString( res ));
}
}
