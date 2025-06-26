package Methods;

public class Factorial {
	public int fact(int n)
	{  int f = 1;
		int i = n-1;
		f = n;
		while(n>0)
		{
			f = f*i;
			i--;
			n--;
					
		}
		return f;
	}
	public static void main(String[]args)
	{
		Factorial f = new Factorial();
		int t = f.fact(5);
		System.out.println(t);
		
		
	}

}

