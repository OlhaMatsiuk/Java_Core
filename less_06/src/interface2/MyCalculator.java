package interface2;

import interface1.Numerable;

public class MyCalculator implements Numerable {

	private double number;
	private double action;

	MyCalculator(double number, double action) {
		this.number = number;
		this.action = action;
	}

	@Override
	public void plus() {
		System.out.println();
		System.out.print(number + " + " + action + " = " + (number + action));

	}

	@Override
	public void minus() {
		System.out.println();
		System.out.print(number + " - " + action + " = " + (number - action));

	}

	@Override
	public void multiply() {
		System.out.println();
		System.out.print(number + " * " + action + " = " + (number * action));

	}

	@Override
	public void devide() {
		System.out.println();
		System.out.print(number + " / " + action + " = " + (number / action));

	}
}
