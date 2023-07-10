package defaultExceptionHandling;

public class Test5 {

	public static void main(String[] args){
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	
