package logos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Faction {

	private String nameFaction;

	public Faction(String nameFaction) {
		super();
		this.nameFaction = nameFaction;
	}

	public String getNameFaction() {
		return nameFaction;
	}

	public void setNameFaction(String nameFaction) {
		this.nameFaction = nameFaction;
	}

	@Override
	public String toString() {
		return nameFaction;
	}

	ArrayList<Deputy> faction = new ArrayList<>();

	public void addDeputy() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть прізвище депутата: ");
		String surname = scan.next();
		System.out.println();

		System.out.print("Введіть ім‘я депутата: ");
		String name = scan.next();
		System.out.println();

		System.out.print("Введіть вік депутата: ");
		int age = scan.nextInt();
		System.out.println();

		System.out.print("Депутат бере хабарі?(true or false): ");
		boolean bribeTaker = scan.nextBoolean();
		System.out.println();

		System.out.print("Введіть вагу депутата: ");
		double weight = scan.nextDouble();
		System.out.println();

		System.out.print("Введіть зріст депутата: ");
		int height = scan.nextInt();
		System.out.println();

		Deputy dep = new Deputy(weight, height, surname, name, age, bribeTaker);

		faction.add(dep);

		System.out.println("Депутат доданий у фракцію!");

	}

	public void removeDeputy() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть прізвище депутата: ");
		String surname = scan.next();
		System.out.println();

		System.out.print("Введіть ім‘я депутата: ");
		String name = scan.next();
		System.out.println();

		boolean flag2 = isDeputyExist(faction, name, surname);

		if (flag2) {

			Iterator<Deputy> iterator = faction.iterator();

			while (iterator.hasNext()) {

				Deputy next = iterator.next();

				if (next.getSurname().equals(surname) && next.getName().equals(name)) {
					System.out.println(next.getSurname() + next.getName() + " Буде видалений!");
					iterator.remove();

				}

			}

		} 
			

	}

	public void allBribeTakers() {

		for (Deputy dep : faction) {

			if (dep.isBribeTaker()==true) {

				System.out.println(dep.toString());
			

			}

		}

	}

	public void bigBribeTaker() {

		int max = 0;

		for (Deputy dep : faction) {

			if (dep.getBribeSize() > max) {
				max = dep.getBribeSize();
			}

		}

		for (Deputy dep : faction) {
			
			if(dep.getBribeSize() == max)
			System.out.print("Найбільшим хабарником у фракції є: " + dep.toString());

		}

	}
	
	
	public void allDeputyFaction() {
		
		for (Deputy dep : faction) {

			System.out.println(dep.toString());
			
		}
		
	}
	
	public void clearFaction() {
		
		for (Deputy dep : faction) {

			faction.clear();
			
		}
		
		System.out.println("У франції більше немає депутатів!");
		
		
	}
	

	private static boolean isDeputyExist(ArrayList<Deputy> faction, String name, String surname) {
		boolean flag = false;

		for (Deputy deputy : faction) {

			if (deputy.getName().equals(name) && deputy.getSurname().equals(surname)) {
				flag = true;
			}
		}

		return flag;
	}

}
