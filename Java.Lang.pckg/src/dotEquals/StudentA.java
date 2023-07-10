package dotEquals;

public class StudentA {

	String name;
	int rollno;
	void Student(String name,int rollno) {
	
		this.name=name;
		this.rollno=rollno;
	}
	
	public boolean equals(Object o) {
	
		if(this==o)
			return true;
		if(o instanceof Student) 
		{
			Student s2=(Student)o;
			if(name.equals(s2.name) && rollno==s2.rollno)
				return true;
			else
				return false;
		}
		return false;
	}
	public static void main(String[] args){
		Student s=new Student("Amit",101);
		Integer i=new Integer(10);
		System.out.println(s.equals(i));
	
	}
}
