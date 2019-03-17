package one;

public class WrongInputConsoleParametersException extends Exception{

	private String str;

	public String getStr() {
		return str;
	}

	public WrongInputConsoleParametersException(String str) {
		super(str);
		this.str = str;
	}
	
	
}
