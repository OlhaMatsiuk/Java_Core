package min_one;

public class Engine {
	
	private int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		super();
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	@Override
	public String toString() {
		return "numberOfCylinders=" + numberOfCylinders ;
	}
	
	

}
