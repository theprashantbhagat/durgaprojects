package threads;

public class SuperDemo extends Thread {

	public void start() {
		
		super.start();
		System.out.println("start method");
	}
	public void run() {
		System.out.println("run method");
	}
}
