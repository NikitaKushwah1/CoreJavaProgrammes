package String_coding_questions;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	public static void main(String[]args)
	{
		String n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		n = sc.nextLine();
		System.out.println("enter second  string");
		String s = sc.nextLine();
		String s1 = n.toLowerCase();
		String s2 = s.toLowerCase();
		 char ch1 [] = s1.toCharArray();
		 char ch2 [] = s2.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 if(Arrays.equals(ch1, ch2))
		 {
			 System.out.println("Anagrame");
		 }
		 else
		 {
			 System.out.println("not angarame");
		 }
		 
		 
	
}
}