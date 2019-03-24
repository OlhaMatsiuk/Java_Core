package min_one;

public class Car {

	private int numberOfHorsepower;
	private int yearOfIssue;
	private Engine engine;
	private Helm helm;
	
	public Car(int numberOfHorsepower, int yearOfIssue, Engine engine, Helm helm) {
		super();
		this.numberOfHorsepower = numberOfHorsepower;
		this.yearOfIssue = yearOfIssue;
		this.engine = engine;
		this.helm = helm;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public Engine getEngine() {
		return engine;
	}

	public Helm getHelm() {
		return helm;
	}

	@Override
	public String toString() {
		return "\nCar [numberOfHorsepower=" + numberOfHorsepower + ","
				+ " yearOfIssue=" + yearOfIssue + ", " + engine
				+ ", " + helm + "]";
	}
	
	
}
