package exceptionsample;

public class Sample {

	
	public void test(int age) throws LicenseException
	{
		if (age<18)
		{
			throw new LicenseException("Not Eligible"); 
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample obj=new Sample();
		try {
			obj.test(12);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();   // instead of printing stmt
		}

	}

}
