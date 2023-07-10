package staticVStransientVSfinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog5 implements Serializable {

	transient static int i=10;
	transient int j=20;
}
class SerializeDemo5{
	public static void main(String[] args) throws Exception{
		
		Dog5 d1=new Dog5();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog5 d2=(Dog5)ois.readObject();
		
		System.out.println(d2.i+"..."+d2.j);
	}
}

