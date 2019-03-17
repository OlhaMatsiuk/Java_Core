package two;

import java.util.Scanner;

public class Main {
	
	
public static void main(String[] args) throws MyException {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enetr a: ");
	double a = scanner.nextDouble();
	
	System.out.print(" \nEnetr b: ");
	double b = scanner.nextDouble();
	
	Methods m = new Methods(a, b);
	
	m.plus();
	m.minus();
	m.multiply();
	m.devide();
	
}


}
