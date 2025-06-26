package String_coding_questions;
import java.util.Scanner;
public class Removeduplicate {
	public static void main(String[]args)
	{
	String s ;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	s = sc.nextLine();
	StringBuilder s1 = new StringBuilder();
	
	 for(int i = 0;i<s.length();i++)
	 {
		 char c = s.charAt(i);
		 int found = 0;
		 for(int j =0;j<s1.length();j++)
		 { 
			 if(s1.charAt(j)==c)
			 {
				 found =1;
				 break;
			 }
		 }
		 if(found==0)
		 {
			 s1.append(c);
		 }
	 }
	 System.out.println(s1.toString());

}
}
