package variable;

public class Test8 {

	int x=10;
	static int y=20;
	public static void main(String[] args)
	  {
	     Test8 t1=new Test8();
	     t1.x=888;
	     t1.y=999;
	     Test8 t2=new Test8();
	     System.out.println(t2.x+"----"+t2.y);//10----999
	}
}
