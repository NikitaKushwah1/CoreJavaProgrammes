package calculator;
import java.util.Scanner;
public class Allmain {
	public static void main(String[]args)
	{ 
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value one");
		 int a = sc.nextInt();
		 System.out.println("Enter value second");
		 int b = sc.nextInt();
		 Operation o = new Operation();
		 int c = 1;
		 while(true)
		 {  System.out.println("Enter 1 for addition");
		   System.out.println("Enter 2 for multiplication");
		   System.out.println("Enter 3 for subtraction");
		   System.out.println("Enter 4 for division");
			 System.out.println("Enter your choice");
			 int choice = sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 int n =  o.add(a, b);
				 System.out.println("Additon " + n);
				 
				 break;
			 case 2:
				 int g = o.multiplicaton(a, b);
				 System.out.println("Multiplication" + g);
				 break;
			 case 3 :
				 int p = o.subtraction(a, b);
				 System.out.println("Subtraction" + p);
				 break;
			 case 4:
				 int j = o.division(a, b); 
				 System.out.println(" Division " + j);
				 break;
				 
				 default:
					 System.out.println("Invalid choice");
			 }

			 
			 
		 }
		 
		 
	}

}
