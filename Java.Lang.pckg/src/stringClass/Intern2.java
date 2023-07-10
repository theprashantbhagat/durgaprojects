package stringClass;

public class Intern2 {

	public static void main(String[] args) {
		
		String s1=new String("karan");
		String s2=s1.concat("mehta");
		String s3=s2.intern();
		String s4="karanmehta";
		System.out.println(s3==s4);//true
		
	}
}
