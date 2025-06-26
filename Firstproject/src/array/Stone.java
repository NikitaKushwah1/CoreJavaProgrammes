package array;
 class Static{
	public static void meet()
	{
		System.out.println("Hello meet");
	}
}

public class Stone extends Static{
	 
	  public static void greet(){
	    
	    System.out.println("Hello Geek!");
	  }
	  public static void meet()
	  {
		  System.out.println("hell");
	  }
	  
	    public static void main (String[] args) {
	    	Stone c = new Stone();
	    	c.meet();
	    	
	      
	      
	    
	}
}
