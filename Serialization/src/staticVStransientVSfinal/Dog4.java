package staticVStransientVSfinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog4 implements Serializable {

	transient int i=10;
	transient static int j=20;
}
class SerializeDemo{
	public static void main(String[] args) throws Exception{
		
		Dog4 d1=new Dog4();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog4 d2=(Dog4)ois.readObject();
		
		System.out.println(d2.i+"..."+d2.j);
	}
}