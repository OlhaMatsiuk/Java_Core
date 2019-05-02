package logos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class VerkhovnaRada {
	
	private static VerkhovnaRada def = new VerkhovnaRada();

	public VerkhovnaRada() {
		
	}
	
	
	
	public static VerkhovnaRada getDef() {
		if (def == null) {
			def = new VerkhovnaRada();
		}

		return def;
	}
	
	
	ArrayList<Faction> verRad = new ArrayList<>();
	
	Supplier<Faction> getDeputyGroup = () -> {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції:");
		String deputyGroupName = scanner.next();

		return new Faction(deputyGroupName);
	};

	public Optional<Faction> findDeputyGroup() {
		Faction DeputyGroupTyped = getDeputyGroup.get();

		Predicate<Faction> isEqualDeputyGroupName = deputyGroup -> deputyGroup.getNameFaction()
				.equalsIgnoreCase(DeputyGroupTyped.getNameFaction());
		
		Optional<Faction> deputyGroupFound = verRad.stream().filter(isEqualDeputyGroupName)
				.findFirst();

		return deputyGroupFound;
	}
	
	public void addFaction() {
		
		Faction deputyGroup = getDeputyGroup.get();

		verRad.add(deputyGroup);
		
		System.out.println("Нова фракція додана!");
		
		
	}
	
	
	public void removeFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			verRad.remove(deputyGroupFound.get());
			System.out.println(deputyGroupFound.get().toString() + " видалена!");
		} else {
			System.out.println("Фракція не існує!");
		}
			
	}
	
	
	public void allFactions() {
		
		verRad.forEach(System.out::println);
		
	}
	
	
	public void clearFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			deputyGroupFound.get().clearFaction();
		} else {
			System.out.println("Фракція не існує!");
		}
		
	}
	
	public void getFactions() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			System.out.println(deputyGroupFound.get().toString());
			deputyGroupFound.get().allDeputyFaction();
		} else {
			System.out.println("Фракція не існує!");
		}
		
	}
	
	public void addDeputyToFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			deputyGroupFound.get().addDeputy();
		} else {
			System.out.println("Фракція не існує!");
		}
		
		
	}
	
	public void removeDeputyFromFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			deputyGroupFound.get().removeDeputy();
		} else {
			System.out.println("Фракція не існує!");
		}
		
		
	}
	
	
	public void allBribeTakersInFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			deputyGroupFound.get().allBribeTakers();
		} 
		
	}
	
	
	public void bigBribeTakerInFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			deputyGroupFound.get().bigBribeTaker();
		} 
		
	}
	
	
	public void allDeputyInFaction() {
		
		Optional<Faction> deputyGroupFound = findDeputyGroup();

		if (deputyGroupFound.isPresent()) {
			deputyGroupFound.get(). allDeputyFaction();
		} 
		
	}
	
	
	
}
