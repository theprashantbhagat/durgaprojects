package variable;

public class Test4 {

	int i=10;
	public static void main(String[] args){
		
	//System.out.println(i);

	//C.E:non-static variable i cannot be referenced from a staticontext(invalid)

	    Test4 t=new Test4();
	        System.out.println(t.i);//10(valid)
	    t.methodOne();
	}
	    public void methodOne()
	       {
	         System.out.println(i);//10(valid)
	       }
	    
}
