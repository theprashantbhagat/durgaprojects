package withRespectToInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Animal1 {
	int i=10;
	Animal1()
	{
		System.out.println("Animal Constructor Called");
	}
}
class Dog1 extends Animal1 implements Serializable{
	int j=20;
	Dog1()
	{
		System.out.println("Dog Constructor Called");
	}
}
class SerializeDemo1{
	public static void main(String[] args) throws Exception {
	
		Dog1 d1=new Dog1();
		d1.i=888;
		d1.j=999;
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
	    
		System.out.println("Deseralization Started");
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1)ois.readObject();
		
		System.out.println(d2.i+".."+d2.j);
		
	}
}