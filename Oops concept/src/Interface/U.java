package Interface;

interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Hello from C");
    }
     
}
class D extends C
{
	public static void main(String[]args)
	{
		C on = new C();
		on.show();
		
	}
}
