package HashSetExamples;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();//insertion order not preserved
		h.add("A");
		h.add("B");
		h.add("H");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
