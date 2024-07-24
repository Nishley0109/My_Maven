package polymorphism;

public class PolymorphismChild extends PolymorphismParent{

	final int a=19;
	
	@Override    //annotation of overriding
	
	public void display()
	{
		System.out.println("Child class");
	//	a=10; since 'a' is a Final we cannot assign any new value to it; its constant
		
		super.display();   // calling parent method 2 ---- calls the immediate parent
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismChild obj=new PolymorphismChild();
		obj.display();
		
		PolymorphismParent obj1=new PolymorphismParent();
		obj1.display(); // calling parent method 1
	}

}
