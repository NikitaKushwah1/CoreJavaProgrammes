package inheritance;

 
 

final class Base {

    void Display()
    {
        System.out.print("Method for Base class.");
    }
}
 

class GFG {

    public static void main(String[] arg)
    {
        Base d = new Base();
        d.Display();
    }
}
