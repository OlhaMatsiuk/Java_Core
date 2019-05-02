package logos;

import java.util.Scanner;
import java.util.function.Supplier;

public class Deputy extends Person {

	private String surname;
	private String name;
	private int age;
	private boolean bribeTaker;
	private int bribeSize;

	public Deputy(String surname, String name) {
		super(0, 0);
		this.surname = surname;
		this.name = name;

	}

	public Deputy(double weight, int height, String surname, String name, int age, boolean bribeTaker) {
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + bribeSize;
		result = prime * result + (bribeTaker ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		if (age != other.age)
			return false;
		if (bribeSize != other.bribeSize)
			return false;
		if (bribeTaker != other.bribeTaker)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Deputy : surname=" + surname + ", name=" + name + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", bribeSize=" + bribeSize;
	}

}
