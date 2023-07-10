package StringTokenizer;

import java.util.StringTokenizer;

public class Demo3 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("19-09-2022","-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
