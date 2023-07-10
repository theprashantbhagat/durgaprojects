package staticVStransientVSfinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog3 implements Serializable {

	int i=10;
	transient static int j=20;
}
class SerializeDemo3{
	public static void main(String[] args) throws Exception{
		
		Dog3 d1=new Dog3();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog3 d2=(Dog3)ois.readObject();
		
		System.out.println(d2.i+"..."+d2.j);
	}
}
