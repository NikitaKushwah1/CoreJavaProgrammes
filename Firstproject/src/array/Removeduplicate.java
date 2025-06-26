package array;
import java.util.Arrays;

   
	public class Removeduplicate {
	     
	    public static void main(String[] args) {
	    	 int[] arr =  {1, 2, 2, 3, 1};

	         System.out.print("Unique: ");
	         for (int i = 0; i < arr.length; i++) {
	             int flag = 0;
	             for (int j = 0; j < i; j++) {
	                 if (arr[i] == arr[j]) {
	                     flag = 1;
	                     break;
	                 }
	             }
	             if (flag == 0) {
	                 System.out.print(arr[i]  +    " ");
	             }
	         }
	          
	}
}