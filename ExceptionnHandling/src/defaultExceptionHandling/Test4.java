package defaultExceptionHandling;

public class Test4 {

	public static void main(String[] args){
		
	try
	{
		System.out.println(10/0);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	/*
	 * catch(ArithmeticException e)
	 * {
	 * e.printStackTrace(); 
	 * }
	 */
	}
}
