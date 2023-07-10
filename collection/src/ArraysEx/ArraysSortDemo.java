package ArraysEx;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		
		int[]a= {10,5,20,11,6};
		System.out.println("primitive arrays before sorting");
		
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("primitive arrays after sorting");
		
		for (int a1:a)
		{
			System.out.println(a1);
		}
		 String [] s= {"A","Z","B"};
		 System.out.println("object array before sorting");
		 
		 for(String a2:s)
		 {
			 System.out.println(2);
		 }
		 Arrays.sort(s);
		 System.out.println("object array after sorting");
		 
		 for(String a1:s)
		 {
			 System.out.println(a1);
		 }
		 Arrays.sort(s, new MyComparator());
		 System.out.println("Object array after sorting by comparator");
		 
		 for(String a1:s)
		 {
			 System.out.println(a1);
		 }
		 
	}
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}