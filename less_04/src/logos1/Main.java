package logos1;

public class Main {
public static void main(String[] args) {
		
		Robot r1 = new Robot();
		CoffeRobot r2 = new CoffeRobot();
		RobotDancer r3 = new RobotDancer();
		RobotCoocker r4 = new RobotCoocker();
		r1.work();
		r2.work();
		r3.work();
		r4.work();
		
		Robot [] arr = {new Robot(),new CoffeRobot(),new RobotDancer(), new RobotCoocker()};
		
		for(int i=0;i<arr.length;i++) {
			arr[i].work();
		}
		
	}
}
