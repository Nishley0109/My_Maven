package abstarcteg;

public class Sample extends AbstarctClass {

	
	public void print()    //to invoke the abstarct method we have create a normal method with the same method name as the abstract method
	{
		System.out.println("same name as abstract metheod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		obj.print();
		obj.display();
		//AbstarctClass obj1=new AbstractClass();
		//obj1.display();
	}

}
