package var_Arg;

public class Test {
	
	public static void methodOne(int... x)
	  {
	     System.out.println("var-arg method");
	  }
	public static void main(String[] args)
	  {
	     methodOne();
	     methodOne(10);
	     methodOne(10,20,30);
	  }
}
