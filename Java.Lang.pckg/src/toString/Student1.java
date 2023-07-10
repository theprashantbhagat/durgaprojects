package toString;

public class Student1 {

	String name;
		int rollno;
		Student1(String name, int rollno){
			this.name=name;
			this.rollno=rollno;
	}
	public static void main(String args[]){
		Student1 s1=new Student1("smrat",101);
		Student1 s2=new Student1("ashok",102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}
