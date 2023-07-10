package linkedHashSetExamples;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

public static void main(String[] args) {
		
		LinkedHashSet h=new LinkedHashSet();//insertion order preserved
		h.add("A");
		h.add("B");
		h.add(null);
		h.add("H");
		h.add("Z");
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
