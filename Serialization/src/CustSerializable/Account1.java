package CustSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Account1 {

	String username="durga";
	transient String pwd="anushka";
	
	private void writeObject(ObjectOutputStream os)throws Exception{
		
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is)throws Exception{
		
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
	}
}
class CustSerializableDemo1 {

	public static void main(String[] args) throws Exception {
		
		Account1 a1=new Account1();
		System.out.println(a1.username+".."+a1.pwd);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account1 a2=(Account1)ois.readObject();
		System.out.println(a2.username+".."+a2.pwd);
	}
}
