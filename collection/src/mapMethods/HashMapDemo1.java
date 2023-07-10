package mapMethods;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap  m=new HashMap();
		Integer I1=new Integer(10);
		Integer I2=new Integer(20);
		m.put(I1, "ravi");
		m.put(I2, "surya");
		System.out.println(m);
	}
}
