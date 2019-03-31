package max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Commodity {

	private String name;
	private int weight;
	private int length;
	private int width;

	public Commodity() {
	}

	public Commodity(String name, int weight, int length, int width) {
		this.name = name;
		this.weight = weight;
		this.length = length;
		this.width = width;
	}

	ArrayList<Commodity> com = new ArrayList<>();

	public void allCommodity() {

		for (Commodity commodity : com) {
			System.out.println(commodity);
		}

	}

	public void addCommodity() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть назву товару: ");
		String name = scan.next();
		System.out.println();

		System.out.print("Введіть довжину товару: ");
		int length = scan.nextInt();
		System.out.println();

		System.out.print("Введіть ширину товару: ");
		int width = scan.nextInt();
		System.out.println();

		System.out.print("Введіть вагу товару: ");
		int weight = scan.nextInt();
		System.out.println();

		Commodity commodity = new Commodity(name, weight, length, width);

		com.add(commodity);

		System.out.println("Товар додано!");

	}

	public void removeCommodity() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть назву товару: ");
		String name = scan.next();
		System.out.println();

		Iterator<Commodity> iterator = com.iterator();

		while (iterator.hasNext()) {

			Commodity next = iterator.next();

			if (next.getName().equalsIgnoreCase(name)) {
				iterator.remove();

				System.out.println("Товар видалено!");
			}

		}

	}

	public void changeCommodity() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введіть назву товару: ");
		String nam = scan.next();
		System.out.println();
		
		for (Commodity commodity : com) {
			

			if (commodity.getName().equalsIgnoreCase(nam)) {
	
				System.out.print("Введіть назву товару: ");
				String name = scan.next();
				System.out.println();

				System.out.print("Введіть довжину товару: ");
				int length = scan.nextInt();
				System.out.println();

				System.out.print("Введіть ширину товару: ");
				int width = scan.nextInt();
				System.out.println();

				System.out.print("Введіть вагу товару: ");
				int weight = scan.nextInt();
				System.out.println();
				
				commodity.setName(name);
				commodity.setLength(length);
				commodity.setWeight(weight);
				commodity.setWidth(width);
				
				System.out.println("Товар замінено!");
			}
			
		}	
				
		
		
	}

	public void sortName() {

		Collections.sort(com, new CommoditySortName());

	}

	public void sortLength() {

		Collections.sort(com, new CommoditySortLength());

	}

	public void sortWidth() {

		Collections.sort(com, new CommoditySortWidth());

	}

	public void sortWeight() {

		Collections.sort(com, new CommoditySortWeight());

	}

	public void getCommodity() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть номер товару(чинаючи з 1): ");
		int i = scan.nextInt();
		System.out.println();

		System.out.println(com.get(i).toString());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", weight=" + weight + ", length=" + length + ", width=" + width + "]";
	}

}
