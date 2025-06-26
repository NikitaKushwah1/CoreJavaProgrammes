package exception;

import java.io.*;

public class ArryOutOfBoundIndex {
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5};
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("out of index please check your code");
		}
	}

}
