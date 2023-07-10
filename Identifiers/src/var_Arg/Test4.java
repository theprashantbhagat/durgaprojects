package var_Arg;

public class Test4 {
	
	public static void methodOne(int[]... x){
	
		for(int[] a:x)
		{
			System.out.println(a[0]);
		}
	}

	public static void main(String[] args)
	{
		int[] l={10,20,30};
	    int[] m={40,50};
	    methodOne(l,m);
	}
}
