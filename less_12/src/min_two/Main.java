package min_two;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	
	static ArrayList<Months> array = new ArrayList<Months>();
	static ArrayList<Seasons> array2 = new ArrayList<Seasons>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		for(Months m : Months.values())
		 array.add(m);
		
		for(Seasons s : Seasons.values())
			 array2.add(s);
		
		

		while (true) {
			menu();
			switch (sc.next()) {
			case "1":
				first();
				break;
			case "2":
				second();
				break;
			case "3":
				third();
				break;
			case "4":
				fourth();
				break;
			case "5":
				fifth();
				break;
			case "6":
				sixth();
				break;
			case "7":
				seventh();
				break;
			case "8":
				eighth();
				break;
			case "9":
				ninth();
				break;
			case "10":
				tenth();
				break;
			}
		}

	}

	static void menu() {
		System.out.println("Натичніть 1, щоб перевірити чи є такий місяць");
		System.out.println("Натичніть 2, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натичніть 3, щоб вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натичніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натичніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натичніть 6, щоб Вивести на екран наступну пору року");
		System.out.println("Натичніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натичніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натичніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натичніть 10,щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

	static void first() {

		System.out.println("Enter Month");
		sc = new Scanner(System.in);

		String month = sc.next().toUpperCase();

		boolean flag = isMonthPresent(array, month);

		if (flag) {
			System.out.println("Month exist");
		} else {
			System.out.println("Month doesnt exit");
		}

	}

	static void second() {

		System.out.println("Enter season");
		sc = new Scanner(System.in);

		String season = sc.next().toUpperCase();

		boolean flag = false;

		for (Months m : array) {
			if (m.getSeason().name().equals(season)) {
				flag = true;
			}
		}

		if (flag) {

			for (Months m : array) {
				if (m.getSeason().toString().equalsIgnoreCase(season)) {
					System.out.println(m);
				}

			}

		}

		else {
			System.out.println("Season doesnt exit");
		}

	}

	static void third() {

		System.out.println("Enter month");
		sc = new Scanner(System.in);

		String month = sc.next().toUpperCase();

		boolean flag = false;

		for (Months m : array) {
			if (m.getDays() == Months.valueOf(month).getDays()) {
				flag = true;
			}
		}

		if (flag) {

			for (Months m : array) {
				if (m.getDays() == Months.valueOf(month).getDays()) {
					System.out.println(m);
				}

			}

		}

		else {
			System.out.println("Season doesnt exit");
		}

	}

	static void fourth() {

		System.out.println("Enter month");
		sc = new Scanner(System.in);

		String month = sc.next().toUpperCase();

		boolean flag = false;

		for (Months m : array) {
			if (m.getDays() < Months.valueOf(month).getDays()) {
				flag = true;
			}
		}

		if (flag) {

			for (Months m : array) {
				if (m.getDays() < Months.valueOf(month).getDays()) {
					System.out.println(m);
				}

			}

		}

		else {
			System.out.println("Season doesnt exit");
		}
	}

	static void fifth() {

		System.out.println("Enter month");
		sc = new Scanner(System.in);

		String month = sc.next().toUpperCase();

		boolean flag = false;

		for (Months m : array) {
			if (m.getDays() > Months.valueOf(month).getDays()) {
				flag = true;
			}
		}

		if (flag) {

			for (Months m : array) {
				if (m.getDays() > Months.valueOf(month).getDays()) {
					System.out.println(m);
				}

			}

		}

		else {
			System.out.println("Season doesnt exit");
		}

	}

	static void sixth() {

		System.out.println("Enter Season");

		sc = new Scanner(System.in);
		String season = sc.next().toUpperCase();

		boolean flag = isSeasonPresent(array2, season);

		if (flag) {
			Seasons season1 = Seasons.valueOf(season);
			int ordinal = season1.ordinal();

			if (ordinal == (array2.size() - 1)) {
				ordinal = 0;
				System.out.println(array2.get(ordinal));
			} else {
				System.out.println(array2.get(ordinal + 1));
			}
		}

		if (!flag) {
			System.out.println("Season doesnt exit");
		}

	}

	static void seventh() {

		System.out.println("Enter Season");

		sc = new Scanner(System.in);
		String season = sc.next().toUpperCase();

		boolean flag = isSeasonPresent(array2, season);

		if (flag) {
			Seasons season1 = Seasons.valueOf(season);
			int ordinal = season1.ordinal();

			if (ordinal == 0) {
				ordinal = 0;
				System.out.println(array2.get(array2.size() - 1));
			} else {
				System.out.println(array2.get(ordinal - 1));
			}
		}

		if (!flag) {
			System.out.println("Season doesnt exit");
		}

	}

	static void eighth() {

		System.out.println("Enter number of day");
		sc = new Scanner(System.in);

		boolean flag = false;

		for (Months m : array) {
			if (m.getDays() % 2 == 0) {
				flag = true;
			}
		}

		if (flag) {

			for (Months m : array) {

				if (m.getDays() % 2 == 0) {
					System.out.println(m);
				}

			}
		} else {
			System.out.println("Day doesnt exit");
		}

	}

	static void ninth() {

		System.out.println("Enter number of day");
		sc = new Scanner(System.in);

		boolean flag = false;

		for (Months m : array) {
			if (m.getDays() % 2 != 0) {
				flag = true;
			}
		}

		if (flag) {

			for (Months m : array) {

				if (m.getDays() % 2 != 0) {
					System.out.println(m);
				}

			}
		} else {
			System.out.println("Day doesnt exit");
		}

	}

	static void tenth() {

		System.out.println("Enter Month");
		sc = new Scanner(System.in);

		String month = sc.next().toUpperCase();

		boolean flag = isMonthPresent(array, month);

		if (flag) {

			Months m = Months.valueOf(month);

			if (m.getDays() % 2 == 0) {
				System.out.println("Yes");
			}

			else {
				System.out.println("No");
			}
		} else
			System.out.println("Month doesnt exit");

	}

	///////////////////////////////

	private static boolean isMonthPresent(ArrayList<Months> ar, String sMonth) {
		boolean flag = false;

		for (Months m : ar) {

			if (m.name().equals(sMonth)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(ArrayList<Seasons> ar, String sSeason) {
		boolean flag = false;

		for (Seasons s : ar) {

			if (s.name().equals(sSeason)) {
				flag = true;
			}
		}
		return flag;
	}
	
	////////////////////////////
}

