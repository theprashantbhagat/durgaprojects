package creatingAndReadingFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abc.text");
		fw.write(100);//adding a single character.
		fw.write("Durga\software Solutions");
		fw.write('\n');
		char[] ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();
	} 
}
