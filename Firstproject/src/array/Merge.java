package array;

import java.util.Arrays;

public class Merge {

	public static void main(String[]args)
	{
	int p[] = {2,3,4,5};
	int b[] = {6,7,8,9,10};
	int c[] = new int [p.length+b.length];
	int k = 0;
	for (int i = 0;i<p.length;i++)
	{ 
		c[k] = p[i];
		k++;
	}
	for (int j = 0;j<b.length;j++)
	{
		c[k] = b[j];
		k++;
	}
	 System.out.println(Arrays.toString(c));

}}