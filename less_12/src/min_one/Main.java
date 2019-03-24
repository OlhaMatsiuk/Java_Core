package max;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Car[][] array = new Car[getRandom(2, 5)][getRandom(2, 5)];

		// Car [][] array = new Car[2][2];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = new Car(getRandom(10, 100), getRandom(1950, 2010), new Engine(getRandom(1, 8)),
						new Helm(getRandom(15, 50), "fgf"));

			}

		}

		Scanner scan = new Scanner(System.in);

		while (true) {

			menu();

			switch (scan.nextInt()) {

			case 1:

				System.out.println(Arrays.deepToString(array));

				break;

			case 2:

				Car car = new Car(getRandom(10, 100), getRandom(1950, 2010), new Engine(getRandom(1, 8)),
						new Helm(getRandom(15, 50), "wor"));
					
				for(int i=0;i<array.length;i++)
				    Arrays.fill( array[i], car );

				System.out.println(Arrays.deepToString(array));

				break;

			default:
				System.out.println("Нажміть цифру 1 або 2");
				break;

			}

		}

	}

	public static int getRandom(int min, int max) {

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}

	public static void menu() {

		System.out.println("\nНажміть 1, щоб вивести на консоль всі автомобілі і їх значення: ");
		System.out.println("Нажміть 2, щоб всі елементти даного масиву замінити на обєкт класу Car");

	}
}
