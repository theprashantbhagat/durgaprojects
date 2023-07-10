package InstanceBlock;

public class Parent {

	int x=10;{
	methodOne();
	
	
	System.out.println("Parent first instance block");
	}
	
	Parent(){
			
		System.out.println("parent class constructor");
	}
	
	public static void main(String[] args){
		
	
		Parent p=new Parent();
	
		System.out.println("parent class main method");
	}
	public void methodOne(){
		
		System.out.println(y);
	}
	
	int y=20;
}
