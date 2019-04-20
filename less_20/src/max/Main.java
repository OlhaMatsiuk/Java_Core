package max;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor1 = Executors.newFixedThreadPool(50);
		ExecutorService executor2 = Executors.newScheduledThreadPool(50);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		System.out.print("Enter delay: ");
		int delay = scan.nextInt();
		
		
		executor1.execute(new Runnable() {
			
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
		});
		
		System.out.println();
		
	
		System.out.print("Enter number2: ");
		int number2 = scan.nextInt();
		System.out.print("Enter delay2: ");
		int delay2 = scan.nextInt();
		
		executor2.execute(new Thread(){
			
			@Override
			public synchronized void run() {
				int fibon0 = 0;
				int fibon1 = 1;
				int fibon;
				
				System.out.print("Thread: "+fibon0 + " " + fibon1 + " ");
				for(int i = 0; i < number2-2; i++) {
					fibon = fibon0 + fibon1;
					fibon0 = fibon1;
					fibon1 = fibon;
					System.out.print(fibon + " ");
					try {
						Thread.sleep(delay2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}

			
		});
		
		executor1.shutdown();
		executor2.shutdown();
	}

}

	

