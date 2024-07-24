package exceptionsample;

public class SampleException {
	
	public void display()
	{
		int h=12;
		
		try
		{
			int b=h/0;
			System.out.println(b);	
		}
		catch(Exception w) //the exception is stored in the variable w
		{
			System.out.println("Exception handeled");
			System.out.println(w);
		}
		
		finally
		{
			System.out.println("Finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("in main 1");
		SampleException obj=new SampleException();
		obj.display();
		System.out.println("in main2");

	}

}
