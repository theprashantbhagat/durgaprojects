package genericsDemo;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("durga");
		l.add("ravi");
		l.add("shiva");
		//l.add(new Integer(10));  --compiletime error
		
		System.out.println(l);
	}

}
