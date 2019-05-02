package logos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
	
	Supplier<Deputy> deputat = () -> {
		
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

		return new Deputy(weight, height, surname, name, age, bribeTaker);
	};
	

	Supplier<Deputy> deputatExist = () -> {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть прізвище депутата: ");
		String surname = scan.next();
		System.out.println();

		System.out.print("Введіть ім‘я депутата: ");
		String name = scan.next();
		System.out.println();

		return new Deputy(surname, name);
	};
	

	
	public void addDeputy() {
		Deputy dep = deputat.get();
		faction.add(dep);
		System.out.println("Депутат доданий у фракцію!");

	}

	public void removeDeputy() {

		Deputy dep = deputatExist.get();
		
		Predicate<Deputy> newDep = deputy -> deputy.getSurname()
				.equalsIgnoreCase(dep.getSurname()) && deputy.getName()
				.equalsIgnoreCase(dep.getName());
		
		Optional<Deputy> deputyFound = faction.stream().filter(newDep).findFirst();

		if (deputyFound.isPresent()) {
			faction.remove(deputyFound.get());
			System.out.println("Депутат " + deputyFound.get().toString() + " видалений");

		} else {
			System.out.println("Депутат не існує!");
		}		

	}

	public void allBribeTakers() {

		List<Deputy> bribeTakers = faction.stream().filter(Deputy::isBribeTaker).collect(Collectors.toList());
		bribeTakers.forEach(System.out::println);

	}

	public void bigBribeTaker() {

		Comparator<Deputy> deputyBribeSizeComparator = (deputy1,
				deputy2) -> (deputy1.getBribeSize() > deputy2.getBribeSize()) ? 1
						: (deputy1.getBribeSize() == deputy2.getBribeSize()) ? 0 : -1;
		Optional<Deputy> largestBribeTaker = faction.stream().filter(Deputy::isBribeTaker)
				.max(deputyBribeSizeComparator);

		if (largestBribeTaker.isPresent()) {
			System.out.println("Big BribeTaker " + largestBribeTaker.get().toString());
		} else {
			System.out.println("BribeTaker is not exist!");
		}


	}
	
	
	public void allDeputyFaction() {
		
		faction.forEach(System.out::println);
		
	}
	
	public void clearFaction() {
		faction.clear();		
	}
	

}
