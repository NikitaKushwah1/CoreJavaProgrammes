package array;
import java.util.Scanner ;
import java.util.Arrays;
public class Main {
public static void main(String[]args) {
	int a [] = new int [5];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter elements");
	for(int i = 0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	 System.out.println("enter number");
	 int e = sc.nextInt();
	
	Findindex Findindex = new Findindex();
	int c = Findindex.index(a,e);
	System.out.println(c);
	
	
	
}
}
