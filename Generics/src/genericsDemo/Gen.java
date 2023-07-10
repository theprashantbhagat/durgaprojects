package genericsDemo;

public class Gen<T> {
	
	T ob;

	public Gen(T ob) {
		super();
		this.ob = ob;
	}
	public void Show()
	{
		System.out.println("The type of ob"+ob.getClass().getName());
	}
	public T getoOb()
	{
		return ob;
	}
}
  class GenDemo
  {
	  public static void main(String[] args) {
		
		  Gen<String> g1=new Gen<String>("durga");
		  g1.Show();
		  System.out.println(g1.getoOb());
		  
		  Gen<Integer> g2=new Gen<Integer>(10);
		  g2.Show();
		  System.out.println(g2.getoOb());
		  
		  Gen<Double> g3=new Gen<Double>(10.5);
		  g3.Show();
		  System.out.println(g3.getoOb());
	}
  }