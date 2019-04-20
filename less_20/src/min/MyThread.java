package min;

import java.util.Scanner;

public class MyThread extends Thread{

	private int number;
	private int delay;

	public MyThread(int delay) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		this.number = scan.nextInt();
		this.delay = delay;
	}
	
	@Override
	public synchronized void run() {
		int fibon0 = 0;
		int fibon1 = 1;
		int fibon;
		
		System.out.print("Thread: "+fibon0 + " " + fibon1 + " ");
		for(int i = 0; i < number-2; i++) {
			fibon = fibon0 + fibon1;
			fibon0 = fibon1;
			fibon1 = fibon;
			System.out.print(fibon + " ");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
