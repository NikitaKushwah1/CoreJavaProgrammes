package array;
import java.util.Arrays;
import java.util.Scanner;
public class Mrgemain {
public static void main(String[]args) {
	int []a = new int[5];
	int []b = new int[5];
	int c [] = new int[10];
	 
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("enter elements");
	for(int i = 0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	System.out.println("enter elements");
	for(int i = 0;i<b.length;i++) {
		b[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(b));
	 int k = 0;
	 for(int i = 0;i<a.length;i++) {
		 c[k++] = a[i];
		 c[k++] = b[i];
	 }
	 for(int j : c) {
		 System.out.println("Values are" + j);
	 }
	
	
	
	
}
}
