package interface2;

public class Main {
	public static void main(String[] args) {

		MyCalculator m1 = new MyCalculator(4, 5);
		m1.plus();
		m1.minus();
		m1.multiply();
		m1.devide();
		System.out.println();
		MyCalculator m2 = new MyCalculator(5.5, 7.8);
		m2.plus();
		m2.minus();
		m2.multiply();
		m2.devide();

	}
}
