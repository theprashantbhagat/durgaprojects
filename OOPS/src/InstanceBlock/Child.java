package InstanceBlock;

public class Child extends Parent{

	int i=100;{
	methodTwo();
	System.out.println("Child first instance block");
	}
	Child(){
	
		System.out.println("Child class constructor");
	}
	public static void main(String[] args){
		
		Child c=new Child();
	    System.out.println("Child class main method");
	}
	public void methodTwo(){
		
		System.out.println(j);
	}
	{
		System.out.println("Child second instance block");
	}
	int j=299;
}
