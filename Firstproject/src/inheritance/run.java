package inheritance;

//Java Program for Method Overriding

 
class Parent {

  
  public  static void  Print() {
     System.out.println("parent class");
 }
}

 
class subclass1 extends Parent {

  
 public static void Print() { 
   System.out.println("subclass1"); 
 }
}

 
class subclass2 extends Parent {

  
 public static void Print() {
     System.out.println("subclass2");
 }
}

 
class run {

  
 public static void main(String[] args) {

     
     Parent a;

      
     a = new subclass1();
     a.Print();

     a = new subclass2();
     a.Print();
 }
}