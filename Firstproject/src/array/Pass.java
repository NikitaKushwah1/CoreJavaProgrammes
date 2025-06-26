package array;

public class Pass {
	public static void main(String[]args)
	{
       int arr[] = {3,1,2,5,4};
       
       System.out.println(sum(arr));
 }
 public static  int sum(int[]arr)
 {
	 int sum = 0;
	 for (int i = 0;i<arr.length;i++)
	 {
		 sum += arr[i];
		 
	 }
//	 System.out.println("sum of array values:" + sum);
	 return sum;
	 
 }
 
}


