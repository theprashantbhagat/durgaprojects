package StringTokenizer;

import java.util.StringTokenizer;

public class Demo1 {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("Durga Software Solutions");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
