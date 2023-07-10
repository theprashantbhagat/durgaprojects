package withRespectToInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {

	String s;
	int i;
	int j;
	public ExternalizableDemo()
	{
		System.out.println("public no-arg constructor");
	}
	public ExternalizableDemo(String s,int i, int j)
	{
		this.s=s;
		this.i=i;
		this.j=j;
	}
	public void writeExternal(ObjectOutput out)throws IOException{
		out.writeObject(s);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in)throws Exception{
		
		ExternalizableDemo t1=new ExternalizableDemo("durga",10,20);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizableDemo t2=(ExternalizableDemo)ois.readObject();
		System.out.println(t2.s+".."+t2.i+".."+t2.j);
	}
}
