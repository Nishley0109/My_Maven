package exceptionsample;

public class Sample1 {
	
	public void check(int age)throws Work
	{
		if(age<22)
		{
			throw new Work("Not Eligible");
			
		}
		else 
		{
			System.out.println("Eligible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj=new Sample1();
		try {
			obj.check(20);
		} catch (Work e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
