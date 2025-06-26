package array;
import java.util.Arrays;
public class Fill{
 public static void main(String[] args)
 {
	 int intArr[] = { 10, 20, 15, 22, 35 };

     int intKey = 22;

     Arrays.fill(intArr, 1,3,intKey);
   
     System.out.println("Integer Array on filling: "
                        + Arrays.toString(intArr));
 }
}
