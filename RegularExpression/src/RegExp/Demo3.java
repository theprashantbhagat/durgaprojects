package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {
	
	public static void main(String[] args) {
		
		int count=0;
		Pattern p=Pattern.compile("\\s");//space character
		//Pattern p=Pattern.compile("\\S");//Except Space Character
		//Pattern p=Pattern.compile("\\d");//Any digit from0-9
		//Pattern p=Pattern.compile("\\D");//except digit,any character
		//Pattern p=Pattern.compile("\\w");//any word character
		//Pattern p=Pattern.compile("\\W");//Except word character
		//Pattern p=Pattern.compile("\\.");//any character
		
		Matcher m=p.matcher("a7b k@9z#");
		
		while(m.find()){
			++count;
			System.out.println(m.start()+".."+m.group());
		}
		System.out.println("The total number of occurance;"+count);
	}
}
