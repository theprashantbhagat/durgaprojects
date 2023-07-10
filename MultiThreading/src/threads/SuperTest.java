package threads;

public class SuperTest {

	public static void main(String[] args) {
		
		SuperDemo s=new SuperDemo();
		s.start();
		System.out.println("main method");
	}
}
