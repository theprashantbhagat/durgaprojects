package CustSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Account2 {

	String username="durga";
	transient String pwd="anushka";
	transient int pin=1234;
	private void writeObject(ObjectOutputStream os)throws Exception{
		
		os.defaultWriteObject();
		String epwd="123"+pwd;
		int epin=4444+pin;
		os.writeObject(epwd);
		os.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream is)throws Exception{
		
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
		int epin=is.readInt();
		pin=epin-4444;
	}
}
class CustSerializableDemo2 {

	public static void main(String[] args) throws Exception {
		
		Account2 a1=new Account2();
		System.out.println(a1.username+".."+a1.pwd+".."+a1.pin);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account2 a2=(Account2)ois.readObject();
		System.out.println(a2.username+".."+a2.pwd+".."+a2.pin);
	}
}
		

