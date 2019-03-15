package logos;

public class Application {

	public static void main(String[] args) {
	
			Rectangle r1 = new Rectangle();
			Rectangle r2 = new Rectangle(5, 7);
			
	
			System.out.print("Площа прямокутника = " + r1.rectangleArea(r1.getLength(), r1.getWidth()) + "   ");
			System.out.println("Периметр прямокутника = " + r1.rectanglePerimeter(r1.getLength(), r1.getWidth()));
	
			System.out.print("Площа прямокутника = " + r2.rectangleArea(r2.getLength(), r2.getWidth()) + "   ");
			System.out.println("Периметр прямокутника = " + r2.rectanglePerimeter(r2.getLength(), r2.getWidth()));
			
			
			Circle c1 = new Circle(4,5);
			
			c1.circleArea(c1.getDiameter(), c1.getRadius());
			c1.circlePerimeter(c1.getDiameter(), c1.getRadius());
			
	}

}
