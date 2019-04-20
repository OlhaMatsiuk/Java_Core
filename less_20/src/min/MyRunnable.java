package min;

import java.util.Scanner;

public class MyRunnable implements Runnable {

	private int number;
	private int delay;

	public MyRunnable(int delay) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		this.number = scan.nextInt();
		this.delay = delay;
		
	}
	
	@Override
	public synchronized void run() {
		int fibon0 = 0;
		int fibon1 = 1;
		int fibon=0;
		int []fArray = new int[number];
		
		System.out.print("Runnable: ");
		
		fArray[0] = fibon0;
		fArray[1] = fibon1;
		
		for(int i = 2; i < number; i++) {
			
			fibon = fibon0 + fibon1;
			fArray[i] = fibon;
			fibon0 = fibon1;
			fibon1 = fibon;
		
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		for(int i = number-1; i >= 0; i--) {
			System.out.print(fArray[i] + " ");
		}
		
	}

}
