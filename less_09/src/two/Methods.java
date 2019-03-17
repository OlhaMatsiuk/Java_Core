package two;

public class Methods {
	private double a;
	private double b;
	   

	public Methods(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void check() throws MyException {
		
		if ((a < 0) && (b < 0)) {
			throw new IllegalArgumentException();
		}
		if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
			throw new ArithmeticException();
		}
		if ((a == 0) && (b == 0)) {
			throw new IllegalArgumentException();
		}
		if ((a > 0) && (b > 0)) {
			throw new MyException("Non");
		}
		
	}

	public void plus() throws MyException {
		check();
		System.out.println("a + b = " + (a+b));
	}
	
	public void minus() throws MyException {
		check();
		System.out.println("a - b = " + (a-b));
	}
	
	public void multiply() throws MyException {
		check();
		System.out.println("a * b = " + (a*b));
	}
	
	public void devide() throws MyException {
		check();
		System.out.println("a / b = " + (a/b));
	}
	
}
