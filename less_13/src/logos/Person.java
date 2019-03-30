package logos;

public class Person {

	private double weight;
	private int height;
	
	
	public Person(double weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	
	
	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + "]";
	}
	
	
}
