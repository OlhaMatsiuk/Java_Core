package logos;

import java.util.Scanner;

public class Deputy extends Person{
	
	private String surname;
	private String name;
	private int age;
	private boolean bribeTaker;
	private int bribeSize;

	public Deputy(double weight, int height, String surname, 
				  String name, int age, boolean bribeTaker) 
	{
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public void giveBribe() {

		if (bribeTaker) {

			Scanner scan = new Scanner(System.in);

			System.out.print("Введіть суму хабаря: ");

			int bribeMoney = scan.nextInt();

			System.out.println();

			if (bribeMoney < 5000)
				bribeSize = bribeMoney;
			else
				System.out.println("Миліція увязнить депутата");
		} else
			System.out.println("Цей депутат не бере хабарів!");

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int brideSize) {
		this.bribeSize = brideSize;
	}
	
	

	@Override
	public String toString() {
		return "Deputy : surname=" + surname + ", name=" + name + ", age=" +
				age + ", bribeTaker=" + bribeTaker
				+ ", bribeSize=" + bribeSize ;
	}

}
