package polymorphism;

public class PolymorphismParent {

	final int b=111;
	
	public void display()
	{
		System.out.println("Parent class");
		// b=10;  since 'b' is a Final we cannot assign any new value to it; its constant
	}
	
	
}
