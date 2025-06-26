 package array;
import java.util.Scanner;

public class Array { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] r = getarr(a);
        System.out.println("Output:");
        for (int val : r) {
            System.out.println(val);
        }
    }

    public  static int[] getarr(int[] a) {
        return a;
    }
}
