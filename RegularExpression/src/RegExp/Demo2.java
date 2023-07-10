package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

public static void main(String[] args) {
		
		int count=0;
		Pattern p=Pattern.compile("[abc]");
		//Pattern p=Pattern.compile("[^abc]");
		//Pattern p=Pattern.compile("[a-z]");
		//Pattern p=Pattern.compile("[0-9]");
		//Pattern p=Pattern.compile("[a-zA-Z0-9]");
		//Pattern p=Pattern.compile("[^a-zA-Z0-9]");
		
		Matcher m=p.matcher("a3b#k@9z");
		
		while(m.find()){
			++count;
			System.out.println(m.start()+".."+m.group());
		}
		System.out.println("The total number of occurance;"+count);
	}
}
