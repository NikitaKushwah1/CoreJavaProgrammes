package Interface;

 
interface Add{
 int add(int a,int b);
}

 
interface Sub{
	int sub(int a,int b);
}

 
class Cal implements Add , Sub
{
	 
	public int add(int a,int b){
   	return a+b;
 }

	 
	public int sub(int a,int b){
 	return a-b;
 }

}

class GFG{
  
 public static void main (String[] args) 
 {
   	    	Add x = new Cal();
   	    	Sub y = new Cal();
   
   	System.out.println("Addition : " + x.add(2,1));
   	System.out.println("Substraction : " + y.sub(2,1));
   
 }
}