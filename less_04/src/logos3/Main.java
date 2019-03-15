package logos3;

public class Main {
	public static void main(String[] args) {
		Animal one = new Animal("Собака",5.5,7);
		
		System.out.println(one);
		
		one.setName("Кішка");
		one.setSpeed(4);
		one.setAge(10);
		
		System.out.println(one);
	}

}
