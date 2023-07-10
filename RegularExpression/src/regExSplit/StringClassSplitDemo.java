package regExSplit;

public class StringClassSplitDemo {

	public static void main(String[] args) {
		
		String s="Durga Software Solutions";
		String[] s1=s.split("\\s");
		for(String s2:s1) 
		{
			System.out.println(s2);
		}
	}
}
