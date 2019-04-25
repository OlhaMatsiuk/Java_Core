package two;

import java.util.function.Predicate;

public class Main {
	
	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 2 + 1);
		eval(number, n -> n == 1);
	}

	public static void eval(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Орел");
		} else
			System.out.println("Решка");
	}
}
