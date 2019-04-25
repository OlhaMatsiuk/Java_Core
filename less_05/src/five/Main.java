package five;

public class Main {
	
	public static void main(String[] args) {
		
		Do eat = () -> System.out.println("I am eating");
		Do sleep = () -> System.out.println("I am sleeping");
		Do swim = () -> System.out.println("I am swimming");
		Do walk = () -> System.out.println("I am walking");
		
		eat.screen();
		sleep.screen();
		swim.screen();
		walk.screen();


	}
	
	public static interface Do{
		void screen();
	}
}
