package array;
import java.util.Arrays;
public class FI {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        arr[1] = 99;   
        System.out.println(arr[1]);     
         arr = new int[]{1, 2, 3};
         System.out.println(Arrays.toString(arr));
    }
}
