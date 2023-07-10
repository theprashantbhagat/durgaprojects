package dotEquals;

public class Student2{

	String name;
	int rollno;
	Student2(String name,int rollno) {	
		this.name=name;
	    this.rollno=rollno;
	}
	public boolean equals(Object o) {
	
		if(this==o)
			return true;	
		if(o instanceof Student2) 
		{	
			Student2 s2=(Student2)o;	
			if(name.equals(s2.name) && rollno==s2.rollno)	
				return true;	
			else
				return false;	
		}	
		return false;
	
	}
	
	public static void main(String[] args){
	
		Student2 s=new Student2("Ankit",101);	
		Integer i=new Integer(10);
		System.out.println(s.equals(i));

	}
}
