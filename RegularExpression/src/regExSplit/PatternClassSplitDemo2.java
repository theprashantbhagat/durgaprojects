package regExSplit;

import java.util.regex.Pattern;

public class PatternClassSplitDemo2 {

	public static void main(String[] args) {
		 Pattern p=Pattern.compile("a");
		 String[]s=p.split("Durga Software Solutions");
		 for(String s1:s)
		 {
			 System.out.println(s1);
		 }
	}
}
