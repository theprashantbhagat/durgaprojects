package Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

public static void main(String[] args) {
		
		int count=0;
		//Pattern p=Pattern.compile("a");//exactly one a
		//Pattern p=Pattern.compile("a+");//at-least one a
		//Pattern p=Pattern.compile("a*");//any no of a including zero number
		Pattern p=Pattern.compile("a?");//at-most one a
		Matcher m=p.matcher("abaabaaab");
		
		while(m.find()){
			++count;
			System.out.println(m.start()+".."+m.group());
		}
		System.out.println("The total number of occurance;"+count);
	}
}
