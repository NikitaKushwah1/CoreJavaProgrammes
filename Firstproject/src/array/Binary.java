package array;
import java.util.Arrays;
public class Binary {
	public static void main(String[]args)
	{
	int arr [] = {1,3,2,4,5,6};
	 
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	int g = Arrays.binarySearch(arr,5);
	System.out.println(g);
	

	}
	
}
