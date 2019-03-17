/*
 * LOGOS IT Academy
 */

package one;

import java.util.Scanner;

/**
 * @author Olha Zakharchuk
 * @version 1.0 
 * @since Java 1.8
 * */

public class Main {
	
	static Months[] array = Months.values();
	static Seasons[] array2 = Seasons.values();
	static Scanner sc = new Scanner(System.in);
	
	
	// each case is responsible for one function
	public static void main(String[] args) throws WrongInputConsoleParametersException {

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
	//display the menu
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

	
	
	/**
	 * Check whether there is such a month
	 * 
	 * */
	static void first() throws WrongInputConsoleParametersException {

		System.out.println("Enter Month");
		sc = new Scanner(System.in);

		String month = sc.next().toUpperCase();

		boolean flag = isMonthPresent(array, month);

		if (flag) {
			System.out.println("Month exist");
		} else {
			String str = "Month doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}

	}

	
	/**
	 * Withdraw all months with the same period of the year
	 * 
	 * */
	static void second() throws WrongInputConsoleParametersException {

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
			String str = "Season doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}

	}

	/**
	 * Withdraw all months having the same number of days
	 * 
	 * */
	static void third() throws WrongInputConsoleParametersException {
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
			String str = "Month doesnt exit";
			throw new WrongInputConsoleParametersException(str);

		}

	}
	
	
	
	/**
	 * Display all the months that have fewer days
	 * 
	 * */
	static void fourth() throws WrongInputConsoleParametersException {

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
			String str = "Season doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}
	}

	
	
	/**
	 * Display all the months that have more days
	 * 
	 * */
	static void fifth() throws WrongInputConsoleParametersException {

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
			String str = "Month doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}

	}
	
	
	/**
	 * Display the next season
	 * 
	 * */
	static void sixth() throws WrongInputConsoleParametersException {

		System.out.println("Enter Season");

		sc = new Scanner(System.in);
		String season = sc.next().toUpperCase();

		boolean flag = isSeasonPresent(array2, season);

		if (flag) {
			Seasons season1 = Seasons.valueOf(season);
			int ordinal = season1.ordinal();

			if (ordinal == (array2.length - 1)) {
				ordinal = 0;
				System.out.println(array2[ordinal]);
			} else {
				System.out.println(array2[ordinal + 1]);
			}
		}

		if (!flag) {
			String str = "Season doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}

	}
	
	/**
	 * Display the last season
	 * 
	 * */
	static void seventh() throws WrongInputConsoleParametersException {

		System.out.println("Enter Season");

		sc = new Scanner(System.in);
		String season = sc.next().toUpperCase();

		boolean flag = isSeasonPresent(array2, season);

		if (flag) {
			Seasons season1 = Seasons.valueOf(season);
			int ordinal = season1.ordinal();

			if (ordinal == 0) {
				ordinal = 0;
				System.out.println(array2[array2.length - 1]);
			} else {
				System.out.println(array2[ordinal - 1]);
			}
		}

		if (!flag) {
			String str = "Season doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}

	}
	
	
	/**
	 * Display all the months that have a pair of days
	 * 
	 * */
	static void eighth() throws WrongInputConsoleParametersException {

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
			String str = "Day doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}

	}
	
	/**
	 * Display all the months that have a odd number of days
	 * 
	 * */
	static void ninth() {

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

	
	/**
	 * The month you entered from the console has a couple of days
	 * 
	 * */
	static void tenth() throws WrongInputConsoleParametersException {

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
		} else {
			String str = "Month doesnt exit";
			throw new WrongInputConsoleParametersException(str);
		}
	}

	///////////////////////////////

	private static boolean isMonthPresent(Months[] month, String sMonth) {
		boolean flag = false;

		for (Months m : month) {

			if (m.name().equals(sMonth)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(Seasons[] season, String sSeason) {
		boolean flag = false;

		for (Seasons s : season) {

			if (s.name().equals(sSeason)) {
				flag = true;
			}
		}
		return flag;
	}

	////////////////////////////
}
