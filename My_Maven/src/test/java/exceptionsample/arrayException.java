package exceptionsample;

public class arrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		
			for(int i=0;i<3;i++)
			{
				System.out.println(arr[i]);
			}
		
		
		
		try
		{
			System.out.println(arr[3]);	
		}
		
		catch(Exception e)
		{
			System.out.println("Out of Bound");
			System.out.println(e);
		}
	}

}
