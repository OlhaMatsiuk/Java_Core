package min_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Car> array = new ArrayList<Car>();


		for (int i = 0; i < getRandom(2,10) ; i++) {

				array.add(new Car(getRandom(10, 100), getRandom(1950, 2010), new Engine(getRandom(1, 8)),
						new Helm(getRandom(15, 50), "fgf")));
		}

		Scanner scan = new Scanner(System.in);

		while (true) {

			menu();

			switch (scan.nextInt()) {

			case 1:

				System.out.println(array);

				break;

			case 2:

				Car car = new Car(getRandom(10, 100), getRandom(1950, 2010), new Engine(getRandom(1, 8)),
						new Helm(getRandom(15, 50), "wor"));
					
				for(int i=0;i<array.size();i++) {
				
				    array.add(i, car);
					array.remove(i+1);
				}
				System.out.println(array);

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

