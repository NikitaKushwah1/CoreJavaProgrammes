package arraylist;

 
import java.util.ArrayList;
import java.util.List;

public class Sublist {
 public static void main(String[] args) {
   
      
     ArrayList<String> l = new ArrayList<>();
     l.add("Rose");
     l.add("Lotus");
     l.add("Lavender");
     l.add("Lilly");
     l.add("Sunflower");

     
     List<String> s = l.subList(1, 4);

     l.subList(1, 4);
     System.out.println("" + l);
     System.out.println("" + s);
 }
}