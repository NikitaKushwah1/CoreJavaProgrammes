package String_coding_questions;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args)
	{
		String n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		n = sc.nextLine();
		String r ="";
		for(int i =n.length()-1;i>=0;i--)
		{
			r = r+n.charAt(i);
			
		}
		System.out.println(r);
		if(r.equals(n))
		{
			System.out.println("String is planidrome");
			
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
		
				
		
	}

}
