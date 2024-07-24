package interface1;

public class Sample2 implements Sample1{

	public void display()
	{
		System.out.println("Display");
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void print()						// method inside the class
	{
		System.out.println("method in class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Sample2 obj=new Sample2();
		Sample1 obj1=new Sample2();    // to create an obj for an interface;
				
		/*obj.display();
		obj.add();
		obj.print();*/
		
		obj1.display();
		obj1.add();
		//obj1.print();
		
	}

}
