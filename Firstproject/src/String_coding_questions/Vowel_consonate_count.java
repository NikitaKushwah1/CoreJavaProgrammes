package String_coding_questions;
import java.util.Scanner;

public class Vowel_consonate_count {
public static void main(String[]args)
{
	String s ;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	s = sc.nextLine();
//	int v = 0;
//	int c =0;
//	for(int i = 0;i<s.length();i++)
//	{ 
//		 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i')
//		 {
//			  v = v+1;
//		 }
//		 else
//		 {
//			 c = c+1;
//		 }
//	}
//	System.out.println("vowels" +v);
//	System.out.println("consonate" +c);
	String r = " ";
for(int i = s.length()-1;i>=0;i--)
{    r = r+s.charAt(i);
//	System.out.println(s.charAt(i));
}
System.out.println(r);
	
}
}
