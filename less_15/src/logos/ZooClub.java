package logos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	Map<Person, List<Animal>> zooClub = new HashMap<>();

	public void addMember() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введіть ім‘я учасника зооклуба: ");

		String name = scanner.next();

		System.out.println();

		System.out.print("Введіть вік учасника зооклуба: ");

		int age = scanner.nextInt();

		System.out.println();

		Person member = new Person(name, age);

		zooClub.put(member, new ArrayList<Animal>());

	}

	public void addAnimal() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введіть ім‘я учасника зооклуба: ");

		String name = scanner.next();

		System.out.println();

		Iterator<Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();

		while (iterator.hasNext()) {

			Entry<Person, List<Animal>> next = iterator.next();

			if (next.getKey().getName().equalsIgnoreCase(name)) {

				System.out.print("Введіть вид тварини: ");

				String type = scanner.next();

				System.out.println();

				System.out.print("Введіть ім‘я тварини: ");

				String nameAn = scanner.next();

				System.out.println();

				Animal animal = new Animal(type, nameAn);

				List<Animal> animals = next.getValue();

				animals.add(animal);

			}

		}

	}

	public void removeAnimalFromMember() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введіть ім‘я учасника зооклуба: ");

		String name = scanner.next();

		System.out.println();

		Iterator<Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();

		while (iterator.hasNext()) {

			Entry<Person, List<Animal>> next = iterator.next();

			if (next.getKey().getName().equalsIgnoreCase(name)) {

				System.out.print("Введіть ім‘я тварини: ");

				String nameAn = scanner.next();

				System.out.println();

				List<Animal> animals = next.getValue();

				Iterator<Animal> iterator2 = animals.iterator();

				while (iterator2.hasNext()) {

					Animal next2 = iterator2.next();

					if (next2.getName().equalsIgnoreCase(nameAn)) {

						iterator2.remove();

					}

				}

			}
		}

	}
	
	
	public void removeMember() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введіть ім‘я учасника зооклуба: ");

		String name = scanner.next();

		System.out.println();

		Iterator<Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();

		while (iterator.hasNext()) {

			Entry<Person, List<Animal>> next = iterator.next();

			if (next.getKey().getName().equalsIgnoreCase(name)) {
				
				iterator.remove();
				
			}
		}
		
	}
	
	public void removeAnimalFromAll() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введіть ім‘я тварини: ");

		String nameAn = scanner.next();

		System.out.println();
		
		
		Iterator<Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();

		while (iterator.hasNext()) {

			Entry<Person, List<Animal>> next = iterator.next();

				List<Animal> animals = next.getValue();

				Iterator<Animal> iterator2 = animals.iterator();

				while (iterator2.hasNext()) {

					Animal next2 = iterator2.next();

					if (next2.getName().equalsIgnoreCase(nameAn)) {

						iterator2.remove();

					}

				}

		}	
		
		
	}
	
	
	public void WatchZooClub() {
		
		for(Entry<Person, List<Animal>>  zc : zooClub.entrySet()) {
			
			System.out.println("У " + zc.getKey() + "є " + zc.getValue());
			
		}
		
		
	}
	
	

}
