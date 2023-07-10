package mapMethods;

import java.util.HashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap m=new HashMap();
		Temp t=new Temp();
		m.put(t, "durga");
		System.out.println(m);
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
class Temp{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize Method Called");
	}
}