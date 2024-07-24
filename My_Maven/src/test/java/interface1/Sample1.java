package interface1;

public interface Sample1 {
	
	public static final int a=10;  // declaring interface variable ---method 1 to declare variable
	int b=10;			//method 2 to declare variable -- complier will consider it as a interface variable since its created within interface class
	
	public abstract void display(); 		// abstract method --- method 1 to declare abstract method 
	
	public void add(); // method 2 to declare abstract method ; it considers it as abstarct method when given in interface class ; the methos has no body
	
	

}
