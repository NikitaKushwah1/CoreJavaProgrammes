package productcrud;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		
		Product product = new Product();
		ArrayList<Product> productList = new ArrayList<>();
		
		try{
			for(int i = 0;i<3;i++) { 
		
			System.out.println(" enter product details");
		   productList.add(product.addProductDetails());
		
			}
		
		Product.getProductDetails(productList);
		
		 Product productById=product.getById(productList);
		System.out.println(  "productId:  "    +         productById.getid()     +   "     category :   "+     productById.getcategory()      +    "  name :    "    +      productById.getProductName()     +     "quantity "     +       productById.getquantity());
	
			Product productByShell = product.sellProduct(productList);
		
		System.out.println(  "  productId:    "   +      productByShell.getid() + "category : "   +     productByShell.getcategory() + "   name :     " +      productByShell.getProductName()      + "   quantity    "      +         productByShell.getquantity());
		
		
		Product productBybuy= product.buyProduct(productList);
		System.out.println(  "productId:      "      +        productBybuy.getid() +       "   category :     "      +      productBybuy.getcategory() +      "   name :      "     +      productBybuy.getProductName()   +    "   quantity      "    +     productBybuy.getquantity());
		 
		
			System.out.println( product.deleteById(productList));
	
		 Product.getProductDetails(productList);
		 } catch(IllegalArgumentException e) {
			 System.out.println("Error : " +e.getMessage());
		 }
		
		 
		 
		
	}

}
