package logos;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(){
		this.length = 3;
		this.width = 5;
	}
	
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int rectangleArea(int length, int width){
		int area;
		area = length * width;
		
		return area;
	}
	
	public int rectanglePerimeter(int length, int width){
		int per;
		per = (length + width)*2;
		
		return per;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
}
