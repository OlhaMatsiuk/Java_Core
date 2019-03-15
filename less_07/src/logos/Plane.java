package logos;

public abstract class Plane{
	
	private int length;
	private int width;
	private int weight;

	ControlAirplane control = new ControlAirplane();
	
	public Plane(int length, int width, int weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public void runningMotors() {
		System.out.println("Start:" + (int)(22 + Math.random()*88));
	}
	
	public void takeOfPlane() {
		System.out.println("Kilometer:" + (Math.random()*1000));
	}
	
	public void aircraftLanding() {
		System.out.println("The plane goes to landing");
	}
	
	
	public void moveUp() {
		control.moveUp();
		}
	
	public void moveDown() {
		control.moveDown();
		}
	
	public void moveRigth() {
		control.moveRight();
		}
	
	public void moveLeft() {
		control.moveLeft();
		}
	
}
