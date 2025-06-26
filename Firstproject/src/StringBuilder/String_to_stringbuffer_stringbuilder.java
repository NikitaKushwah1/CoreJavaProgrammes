package StringBuilder;

public class String_to_stringbuffer_stringbuilder {
	public static void main(String[]args)
	{
		String s = "Geeks";
		StringBuffer sbr = new StringBuffer(s);
		sbr.reverse();
		System.out.println(sbr);
		StringBuilder sb1 = new StringBuilder(s);
		sb1.append("forGeeks");
		System.out.println(sb1);
	}

}
