package hybrid;

 
interface A {
 void showA();
}

 
interface B {
 void showB();
}

 
class C implements A, B {
 public void showA() {
     System.out.println("Inside  from A");
 }

 public void showB() {
     System.out.println("Inside from B");
 }
}

class D extends C {
 public void showD() {
     System.out.println("Inside from D");
 }
}

public class Hyd{
 public static void main(String[] args) {
     D obj = new D();
     obj.showA();  
     obj.showB(); 
     obj.showD();  
 }
}
