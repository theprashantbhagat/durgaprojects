package threads;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		MyThread2 t2=new MyThread2();
		t2.start();
		t2.run();
		System.out.println("main method");
	}
}
