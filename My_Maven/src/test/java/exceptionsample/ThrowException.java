package exceptionsample;

public class ThrowException {
	
	public static void test(int age)
	{
		//int age;
		if (age<18)
		{
			throw new ArithmeticException("Not Eligible"); 
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowException.test(2);
		System.out.println("End");
		
	}

}


