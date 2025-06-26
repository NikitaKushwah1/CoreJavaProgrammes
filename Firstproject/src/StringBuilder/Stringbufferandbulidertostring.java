package StringBuilder;

public class Stringbufferandbulidertostring {
public static void main(String[]args)
{
	StringBuffer sbr = new StringBuffer("Geeks");
	StringBuilder sb1 = new StringBuilder("hello");
	String s1 = sbr.toString();
	System.out.println("stringbuffer to string :" + s1);
	String s2 = sb1.toString();
	System.out.println("stringuilder object to string:" + s2);
	sbr.append("ForGekks");
	System.out.println(sbr);
	System.out.println(s1);
	
}
}
