package logos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			
			menu();
			
			Scanner scan = new Scanner(System.in);
			
			switch(scan.nextInt()) {
			
			case 1: VerkhovnaRada.getDef().addFaction(); break;
			case 2: VerkhovnaRada.getDef().removeFaction();break;
			case 3: VerkhovnaRada.getDef().allFactions();break;
			case 4: VerkhovnaRada.getDef().clearFaction();break;
			case 5: VerkhovnaRada.getDef().getFactions();break;
			case 6: VerkhovnaRada.getDef().addDeputyToFaction();break;
			case 7: VerkhovnaRada.getDef().removeDeputyFromFaction();break;
			case 8: VerkhovnaRada.getDef().allBribeTakersInFaction();break;
			case 9: VerkhovnaRada.getDef().bigBribeTakerInFaction();break;
			default: System.out.println("Введіть цифру від 1 до 9!");
			
			}
			
			
		}
		
	}
	
	
	public static void menu() {
		System.out.println();
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		
	}

}
