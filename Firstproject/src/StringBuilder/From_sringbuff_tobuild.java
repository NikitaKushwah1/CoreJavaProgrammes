package StringBuilder;

public class From_sringbuff_tobuild {
 public static void main(String[]args)
 {
	 StringBuffer sbr = new StringBuffer("Geek");
	 String s = sbr.toString();
	 StringBuilder sb1 = new StringBuilder(s);
	 System.out.println(sb1);
 }
}
