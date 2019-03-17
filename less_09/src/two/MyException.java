package two;

public class MyException extends Exception{
	
	private String str;

	public MyException(String str) {
		super(str);
	}
        
	public String getStr() {
		return str;
	}
	

}
