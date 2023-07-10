package ArraysEx;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		
		int[]a= {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		
		String[] s= {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(binarySearch(s, "Z"));
		System.out.println(binarySearch(s, "S"));
		
		Arrays.sort(s);
		System.out.println(binarySearch(s, "Z", new MyComparator1()));
		System.out.println(binarySearch(s, "S", new MyComparator1()));
		System.out.println(binarySearch(s, "N"));
	}

	private static char[] binarySearch(String[] s, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static char[] binarySearch(String[] s, String string, MyComparator1 myComparator1) {
		// TODO Auto-generated method stub
		return null;
	}
}
class MyComparator1 implements Comparator{
	
	public int compare(Object o1, Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}
