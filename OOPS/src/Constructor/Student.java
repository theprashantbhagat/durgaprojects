package Constructor;

public class Student {

	String name;
	int rollno;
	
	Student(String name,int rollno){
	
		this.name=name;	
		this.rollno=rollno;
		
	}
	public static void main(String[] args){
			
	 	Student s1=new Student("Ankit",101);
	    Student s2=new Student("Kartik",102);
	}
}
