package min;

public class Person {
	
	private String name;
	private double salary;
	
	@Integ(params = "Person age")
	private int age;
	@Integ(params = "Person year")
	private int year;
	
	public Person(String name, double salary, int age, int year) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", age=" + age + ", year=" + year + "]";
	}
	
	

}
