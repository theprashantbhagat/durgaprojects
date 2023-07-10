package RegExp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdExtracterDemo {

	public static void main(String[] args)throws Exception {
		
		PrintWriter out=new PrintWriter("output.txt");
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[.][a-zA-Z]");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			Matcher m=p.matcher(line);
			while(m.find())
			{
				out.println(m.group());
			}
			line=br.readLine();
		}
		out.flush();
	}
}
