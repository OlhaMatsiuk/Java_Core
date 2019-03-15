package logos2;

public class Car {

	private String model;
	private int age;
	private Helm helm;
	private Wheel wheel;
	private Body body;
	
	public Car(String model, int age, Helm helm, Wheel wheel, Body body) {
	
		this.model = model;
		this.age = age;
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}
	
	
	void changeModel() {
		this.model = "ooo";
		this.age = 0;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", age=" + age + ", helm=" + helm + ", wheel=" + wheel + ", body=" + body + "]";
	}
}
