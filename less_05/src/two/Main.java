package two;

public class Main {
public static void main(String[] args) {
		
		int a = (int)(Math.random()*2 + 1);
		
		switch(a) {
		case 1: System.out.println("Орел");
		break;
		case 2: System.out.println("Решка");
		break;
		default : System.out.println("Ребро");
		
		};
		
	}
}
