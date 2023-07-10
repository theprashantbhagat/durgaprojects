package variable;

public class Test6 {

	static int i=10;
	public static void main(String[] args)
	{
	Test6 t=new Test6();
	System.out.println(t.i);//10
	System.out.println(Test6.i);//10
	System.out.println(i);//10
	}
}
