package comparatorEx;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetdemo2 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Raja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}
class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=(String)obj2;
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);

	}
}
