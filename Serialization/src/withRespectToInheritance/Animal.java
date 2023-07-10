package withRespectToInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Animal implements Serializable {

	int i=10;
}
class Dog extends Animal{
	int j=20;
}
class SerializeDemo{
	public static void main(String[] args) throws Exception {
		Dog d1=new Dog();
		System.out.println(d1.i+".."+d1.j);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+".."+d2.j);
	}
}