package productcrud;

import java.util.Scanner;
import java.util.*;

public class Product {
	
   private int id;
   private String productName;
   private String category;
   private int quantity;
   
   Scanner sc = new Scanner(System.in);
   
   public void setid(int id) {
	   this.id= id;
   }
   
   public void  setproduct_name(String product_name) {
	   this.productName = product_name;
   }
   
   public void setcategory(String category) {
	   this.category = category;
   }
   
   public void setquantity(int quantity) {
	   this.quantity = quantity;
   }
   
   public int getid() {
	   return id;
   }
   
   public String getProductName() {
	   return productName;
   }
   
   public String getcategory() {
	   return category;
   }
   
   public int getquantity() {
	   return quantity;
   }
   
   
   public  Product addProductDetails()  {
	   
	   Product product = new Product();
	   
	   System.out.println("Enter product id :");
	    String input =sc.next();
	    if(!input.matches("\\d+")) {
	    	throw new IllegalArgumentException("Product Id must be numbers only");
	    }
	    	
	   product.setid(Integer.parseInt(input));
	    
      if(product.getid()<=0 ) {
    	  throw new IllegalArgumentException(" Product Id  is Invalid or must be a number");
      }
	   sc.nextLine();
	   System.out.println("Enter  product name:");
	   Scanner sc1 = new Scanner(System.in);
	   product.setproduct_name(sc.nextLine());
	   
	   if(product.getProductName()==null ||product.getProductName().trim().isEmpty()) {
		   throw new IllegalArgumentException("Error  Name is Invalid");
	   }
	   
	   System.out.println("Enter product quantity  :");
	   String quantityInput = sc.next();
	   if(!quantityInput.matches("\\d+")){
		   throw new IllegalArgumentException("quantinty must be  number");
	   }
	   product.setquantity(Integer.parseInt(quantityInput));

       if(product.getquantity()<=0) {
    	   throw new IllegalArgumentException(" quantity must me positive ");
       }

	   System.out.println("Enter product category");
	   sc.nextLine();
	   product.setcategory(sc.nextLine());

	    return product;
   }
   
   
   public static void getProductDetails(ArrayList<Product>productList) {
	   
	   
	   System.out.println("== Product details ==");
	   
	   for(Product p : productList) {
		   System.out.println("Product id : " +p.getid());
		   System.out.println("Product name : " +p.getProductName());
		   System.out.println("Product category : " +p.getcategory());
		   System.out.println("Product quantity : " +p.getquantity());
	   }
   }
   

 public Product  getById(ArrayList<Product>productList) {
	  
	 System.out.println("Enter product id for get :");
	 String input =sc.next();
	    if(!input.matches("\\d+")) {
	    	throw new IllegalArgumentException("Product Id must be numbers only");
	    }
	    int product_id = Integer.parseInt(input);
	     
	    if(product_id <=0) {
	    	 throw new IllegalArgumentException(" product id is invalid");
	    }
	  for(Product p :productList) {
		  if(p.getid() == product_id) {
			  return p;
			  
		  }
	  }
	 return null;
 }
   
   public  boolean deleteById(ArrayList<Product>productList) {
	   System.out.println("Enter product for delete id :");
	   String input =sc.next();
	    if(!input.matches("\\d+")) {
	    	throw new IllegalArgumentException("Product Id must be numbers only");
	    }
	    int delete_id = Integer.parseInt(input);
	   
	    if(delete_id<=0) {
	    	 throw new IllegalArgumentException(" Id must be positive ");
	    }
	    for(int i = 0;i<productList.size();i++) {
	    	 if(productList.get(i).getid() == delete_id) {
	    		  productList.remove(i);
	    		  return true;
    		 }
	    		 
	    	 }
    	
    
   return false;
 }
   
    public Product sellProduct(ArrayList<Product>productList) {
    	  
 	   System.out.println("Enter product id for sell :");
 	  String input =sc.next();
	    if(!input.matches("\\d+")) {
	    	throw new IllegalArgumentException("Product Id must be numbers only");
	    }
 	   int product_id = Integer.parseInt(input);
 	    
 	   if(product_id <=0) {
 		  throw new IllegalArgumentException(" Product Id is Invalid");
 	   }
 	  
 	  System.out.println("Enter quantity for selling:");
 	 String quantityinput =sc.next();
	    if(!quantityinput.matches("\\d+")) {
	    	throw new IllegalArgumentException(" Quantity must be numbers only");
	    }
	   int quantityToShell = Integer.parseInt(quantityinput);
	    
	   if(quantityToShell<=0) {
		   throw new IllegalArgumentException(" quantity must be positive");
	   }
		   
	   
	   for(Product p : productList) {
		   if(p.getid() == product_id) {
			   if(p.quantity >=quantityToShell) {
				   p.quantity = p.quantity - quantityToShell;
				  return p;
			   }
		   
		   else {
			   System.out.println("Invalid  quantity");
		 	    
		   }
		   }
	   }
	   return  null;
 	   
 }
   
    public Product buyProduct(ArrayList<Product>productList) {
    	 System.out.println("Enter product id for buy:");
    	 String input =sc.next();
 	    if(!input.matches("\\d+")) {
 	    	throw new IllegalArgumentException("Product Id must be numbers only");
 	    }
   	   int product_id = Integer.parseInt(input);
   	 
   	if(product_id <= 0) {
		  throw new IllegalArgumentException(" Product Id is Invalid");
	   }
   	   
   	  System.out.println("Enter quantity for buy:");
   	String quantityInput =sc.next();
    if(!input.matches("\\d+")) {
    	throw new IllegalArgumentException("Quantity  must be numbers only");
    }
  	   int quantityToBuy = Integer.parseInt(quantityInput);
  	  
  	 if(quantityToBuy<=0 || quantityToBuy<=100) {
		   throw new IllegalArgumentException(" quantity must be positive");
	   }
		 
  	   
  	 for(Product p : productList) {
		   if(p.getid() == product_id) {
			   p.quantity = p.quantity + quantityToBuy;
			   return  p;
		   }
		   }
	   
	   return  null;
  	   
  	   
  	   
    }
}	  
	  
	  
	  	
	    
	   
   
      
   

