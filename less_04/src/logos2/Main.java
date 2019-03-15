package logos2;

public class Main {
public static void main(String[] args) {
		
		Helm helm = new Helm(3.5);
		Wheel wheel= new Wheel(14);
		Body body = new Body("yellow");
				
		Car c1 = new Car("corolla",4,helm,wheel,body);
		
		System.out.println(c1);
		
		c1.changeModel();
		System.out.println(c1);
		helm.increaseDiameter();
		System.out.println(c1);
		wheel.increaseSize(3);
		System.out.println(c1);
		body.changeColor();
		System.out.println(c1);
	}
}
