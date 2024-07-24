package aggregationsample;

public class Sample2 {

	public void print()
	{
		System.out.println("Class 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj1=new Sample1();			// aggregation  - calling the Sample1 method 
		obj1.display();
		
		
		Sample2 obj2= new Sample2();
		obj2.print();
	}

}
