package staticVStransientVSfinal;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.io.Serializable;
  
public class Dog1 implements Serializable {
  
	int i=10;
	transient int j=20; 
} 
class SerializeDemo1{
	public static void main(String[] args) throws Exception{
  
		Dog1 d1=new Dog1();
  
		FileOutputStream fos=new FileOutputStream("abc.ser"); 
		ObjectOutputStream oos=new ObjectOutputStream(fos); 
		oos.writeObject(d1);
  
		FileInputStream fis=new FileInputStream("abc.ser"); 
		ObjectInputStream ois=new ObjectInputStream(fis); 
		Dog1 d2=(Dog1)ois.readObject();
  
		System.out.println(d2.i+"..."+d2.j); } }
 