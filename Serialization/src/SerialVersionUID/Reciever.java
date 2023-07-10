package SerialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reciever {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis); 
		Dog1 d2=(Dog1)ois.readObject();
	
		System.out.println(d2.i+"..."+d2.j);
	}
}
