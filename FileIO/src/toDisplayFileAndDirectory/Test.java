package toDisplayFileAndDirectory;

import java.io.File;

public class Test {

	public static void main(String[] args) throws Exception{
		
		int count=0;
		File f=new File("E:\\notepad");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println("The Total number:"+count);
	}
}
