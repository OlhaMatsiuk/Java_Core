package min;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread(1000);
		thread1.start();
		thread1.join();
		
		System.out.println();
		
		MyRunnable thread2 = new MyRunnable(1000);
		Thread t = new Thread(thread2);
		t.start();	
		
	}

}
