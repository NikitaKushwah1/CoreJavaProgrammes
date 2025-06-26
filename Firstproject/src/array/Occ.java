package array;
//Remove all Occurrences of an Element from Array in Java
import  java.util.Arrays;
public class Occ {
	public static void main(String[]args)
	{
   int a[] = {1,2,3,4,3,5,3,6,8,9};
   int key = 3;
   for (int i = 0;i<a.length;i++)
   {
	   if(a[i]==key)
	   {
		   a[i]=a[i+1];
	   }
   }
   System.out.println(Arrays.toString(a));
   
	}
   
}