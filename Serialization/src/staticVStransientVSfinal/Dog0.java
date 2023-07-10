package staticVStransientVSfinal;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.io.Serializable;
  
public class Dog0 implements Serializable {
  
	transient int i=10;
	int j=20; 
} 
class SerializeDemo0{
	public static void main(String[] args) throws Exception{
  
		Dog0 d1=new Dog0();
  
		FileOutputStream fos=new FileOutputStream("abc.ser"); 
		ObjectOutputStream oos=new ObjectOutputStream(fos); 
		oos.writeObject(d1);
  
		FileInputStream fis=new FileInputStream("abc.ser"); 
		ObjectInputStream ois=new ObjectInputStream(fis); 
		Dog0 d2=(Dog0)ois.readObject();
  
		System.out.println(d2.i+"..."+d2.j); } }
 
