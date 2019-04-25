package three;

public class Main {
	public static void main(String[] args) {

		
		Screen screenMassage = string -> System.out.println(string);
		
		screenMassage.screen("Float=  " + Float.MAX_VALUE);
		screenMassage.screen("Double=  " + Double.MAX_VALUE);
	
		
	}
	
	
	public static interface Screen{
		void screen(String string);
	}
}
