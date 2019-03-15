package logos2;

public class Body {
private String color;
	
	

	public Body(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [color=" + color + "]";
	}
	
	public void changeColor() {
		int a =(int) (1 +Math.random()*4);
		switch(a) {
		case 1 : this.color = "red";
		break;
		case 2 : this.color = "green";
		break;
		case 3 : this.color = "blue";
		break;
		case 4 : this.color = "grey";
		}
	}
}
