package logos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ZooClub zooClub = new ZooClub();
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			menu();

			switch (scan.nextInt()) {

			case 1: {
				zooClub.addMember();
				break;
			}

			case 2: {
				zooClub.addAnimal();
				break;
			}

			case 3: {
				zooClub.removeAnimalFromMember();
				break;
			}

			case 4: {
				zooClub.removeMember();
				break;
			}

			case 5: {
				zooClub.removeAnimalFromAll();
				break;
			}

			case 6: {
				zooClub.WatchZooClub();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Нажміть число від 0 до 6!");
				break;
			}
			}
		}		
		
		
		
	}
	
	


static void menu() {
	System.out.println();
	System.out.println("Нажміть 1, щоб додати учасника зооклуба");
	System.out.println("Нажміть 2, щоб додати тварину учаснику зооклуба");
	System.out.println("Нажміть 3, щоб видалити тварину у учаснику зооклуба");
	System.out.println("Нажміть 4, щоб видалити учасника зооклуба");
	System.out.println("Нажміть 5, щоб видалити тварину у всіх учасників зооклубу");
	System.out.println("Нажміть 6, щоб побачити всіх учасників зооклубу");
	System.out.println("Нажміть 0, щоб вийти з програми");
}

}
