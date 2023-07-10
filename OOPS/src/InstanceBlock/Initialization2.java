package InstanceBlock;

public class Initialization2 {

	private static String methodOne(String msg){
		
		System.out.println(msg);

	return msg;
	}
	static String m=methodOne("1"); {
		
		m=methodOne("2");
	}
	static {
	
		m=methodOne("3");
	}
	public static void main(String[] args){
	
		Object obj=new Initialization2();
	}
}
