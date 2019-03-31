package max;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Commodity commodity = new Commodity();
		
	
		while(true) {
			
			menu();
			
			switch(scan.nextInt()) {
			
			case 0: {
				commodity.allCommodity();
				break;
			}
			
			case 1: {
				commodity.addCommodity();
				break;
			}

			case 2: {
				commodity.removeCommodity();
				break;
			}

			case 3: {
				commodity.changeCommodity();
				break;
			}

			case 4: {
				commodity.sortName();
				break;
			}

			case 5: {
				commodity.sortLength();
				break;
			}

			case 6: {
				commodity.sortWidth();
				break;
			}

			case 7: {
				commodity.sortWeight();
				break;
			}

			case 8: {
				commodity.getCommodity();
				break;
			}

			case 9: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Нажміть від 1 до 9!");
				break;
			}
			
			}
			
		}
		
		
	}
	
	
	
	public static void menu() {
		
		
		 System.out.println("\nНажміть 0, щоб Вивести всі товари: ");
		 System.out.println("Нажміть 1, щоб Додати товар: ");
		 System.out.println("Нажміть 2, щоб Видалити товар: ");
		 System.out.println("Нажміть 3, щоб Замінити товар: ");
		 System.out.println("Нажміть 4, щоб Сортувати за назвоню: ");
		 System.out.println("Нажміть 5, щоб Сортувати за довжиною: ");
		 System.out.println("Нажміть 6, щоб Сортувати за шириною: ");
		 System.out.println("Нажміть 7, щоб Сортувати за вагою: ");
		 System.out.println("Нажміть 8, щоб Вивести контретний товар: ");
		 System.out.println("Нажміть 9, щоб Вийти з програми: ");
		
		
	}
	
}
