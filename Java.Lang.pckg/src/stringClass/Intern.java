package stringClass;

public class Intern {

	public static void main(String[] args) {
		
		String s1=new String("karan");
		String s2=s1.intern();
		System.out.println(s1==s2); //false
		String s3="karan";
		System.out.println(s2==s3);//true
	}
}
