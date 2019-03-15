package logos;

public class Cy_27 extends Plane implements SpecialFeatures{

	private int maxSpeed;
	private String color;
	
	public Cy_27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	
	public void turboAcceleration() {
		System.out.println("New Speed = " + (int)(maxSpeed + Math.random()*maxSpeed));
	}

	@Override
	public void stealthTechnology() {
		System.out.println("The plane is not visible on the drain: " + (int)(Math.random()*360));
	}

	@Override
	public void nuclearStrike() {
		System.out.println("The number of nuclear warheads to be dropped: " + (int)(Math.random()*10));
	}

}
