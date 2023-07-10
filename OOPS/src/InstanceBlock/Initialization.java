package InstanceBlock;

public class Initialization {

	private static String methodOne(String msg){	
	
		System.out.println(msg);
	return msg;

	}
	public Initialization(){
	
		m=methodOne("1"); 
	}
	{ 			
		m=methodOne("2"); 
	}
	String m=methodOne("3");
	
	public static void main(String[] args){
		
		Object obj=new Initialization(); 
	}
}
