package cursorsExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("Ankit");
		l.add("Sameer");
		l.add("ketan");
		l.add("Suraj");
		
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			
			if(s.equals("Sameer"))
			{
				ltr.remove();
			}
			else if(s.equals("Suraj"))
			{
				ltr.add("Kunal");
			}
			else if (s.equals("ketan"))
			{
				ltr.set("Champak");
			}
		}
		System.out.println(l);
	}
}
