package threads;

public class MyThread2 extends Thread {

	public void start() {
		System.out.println("start method");
	}
	public void run() {
		System.out.println("run method");
	}
}
