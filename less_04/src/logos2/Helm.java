package logos2;

public class Helm {
private double diameter;
	
	

	public Helm(double diameter) {
	
		this.diameter = diameter;
	}
	@Override
	public String toString() {
		return "Helm [diameter=" + diameter  + "]";
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public void increaseDiameter() {
		this.diameter =  diameter*diameter;
	}
	
	
}
