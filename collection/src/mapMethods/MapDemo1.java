package mapMethods;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap();
		m.put(101, "durga");
		m.put(102, "shiva");
		m.put(101, "ravi");
		System.out.println(m);
		
	
	}
}
