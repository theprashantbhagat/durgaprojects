package threads;

public class ThreadDemoRun {

public static void main(String[] args) {
		
		MyThread t=new MyThread();
		t.run();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
