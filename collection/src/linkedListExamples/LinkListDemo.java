package linkedListExamples;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0,"software");
		l.add(0,"venky");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);
	}
}
