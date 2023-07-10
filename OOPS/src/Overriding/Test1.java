package Overriding;

public class Test1 {

		public static void main(String[] args) {
		
			Parent1 p=new Parent1();
		    p.methodOne(10);//parent class
		    
		    Child1 c=new Child1();
		    c.methodOne(10);//child class
		    
		    Parent1 p1=new Child1();
		    p1.methodOne(10);//parent class
		}
}
