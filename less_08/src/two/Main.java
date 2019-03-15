package two;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");

		if (scanner.hasNextInt()) {

			if (scanner.nextInt() % 2 == 0)
				System.out.println("Парне");
			else
				System.out.println("Непарне");

		} else
			System.out.println("Not integer");

	}
}
