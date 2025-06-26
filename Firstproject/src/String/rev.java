package String;
//import java.util.
public class rev {
	public static void main(String[]args)
	{
  String s = "Nikita";
//   String s1 = s.replace("N", "j");
  String r = "";
  for (int i = s.length()-1;i>=0;i--)
  {
	  r = r + s.charAt(i);
  }
   System.out.println(r);
}
}
 