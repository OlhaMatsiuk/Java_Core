package three;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first:");

		if (scanner.hasNextInt()) {
			 int a = scanner.nextInt();

			System.out.print("Enter second:");

			if (scanner.hasNextInt()) {
				int b = scanner.nextInt();
				System.out.println("Add: " + (a + b));
			}

			else
				System.out.println("Not integer second number");
		}

		else
			System.out.println("Not integer first number");

		
	}
}
