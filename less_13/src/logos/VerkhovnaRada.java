package logos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
	
	public void addFaction() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		System.out.println();
		
		Faction newFaction = new Faction(nameFaction);
		
		verRad.add(newFaction);
		
		System.out.println("Нова фракція додана!");
		
		
	}
	
	
	public void removeFaction() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		boolean flag2 = isFactionExist(verRad, nameFaction);
		
		if(flag2) {
			
			Iterator<Faction> iterator = verRad.iterator();

			while (iterator.hasNext()) {

				Faction next = iterator.next();

				if (next.getNameFaction().equals(nameFaction)) {
					System.out.println(next.getNameFaction() + " Буде видалений!");
					iterator.remove();

				}
			}
			
		}
			
	}
	
	
	public void allFactions() {
		
		for (Faction fac : verRad) {

			System.out.println(fac.toString());
			
		}
		
	}
	
	
	public void clearFaction() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction)) {
				
				
				fac.clearFaction();

				
			}
				
				
			
		}
		
	}
	
	public void getFactions() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction))
			
			fac.allDeputyFaction();
			
			
		}
		
	}
	
	public void addDeputyToFaction() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction))
			{	
				fac.addDeputy();
			
			}
		
		}
		
		
	}
	
	public void removeDeputyFromFaction() {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction))
			{	
				fac.removeDeputy();
			}
			
		}
		
		
	}
	
	
	public void allBribeTakersInFaction() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction))
			{	
				fac.allBribeTakers();
			}
			
		}
		
	}
	
	
	public void bigBribeTakerInFaction() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction))
			{	
				fac.bigBribeTaker();
			}
			
		}
		
	}
	
	
	public void allDeputyInFaction() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву фракції: ");
		
		String nameFaction = scan.next();
		
		
		for (Faction fac : verRad) {

			if(fac.getNameFaction().equals(nameFaction))
			{	
				fac.allDeputyFaction();
			}
			
		}
		
	}
	
	
	
	private static boolean isFactionExist(ArrayList<Faction> verRad, String nameFaction) {
		boolean flag = false;

		for (Faction fac : verRad) {

			if (fac.getNameFaction().equals(nameFaction)) {
				flag = true;
			}
		}

		return flag;
	}

}
