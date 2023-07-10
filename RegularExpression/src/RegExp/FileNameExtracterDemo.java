package RegExp;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtracterDemo {

	public static void main(String[] args)throws Exception {
		
		int count =0;
		Pattern p=Pattern.compile("[a-zA-Z0-9_$]+[.]txt");
		File f=new File("F:\\DurgaSoft_practice");
		String[] s=f.list();
		for(String s1:s)
		{
			Matcher m=p.matcher(s1);
			if(m.find()&&m.group().equals(s1))
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
	}
}
