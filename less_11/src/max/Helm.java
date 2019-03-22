package max;

public class Helm {
	
	private int diameter;
	private String typeOfMaterial;
	
	
	public Helm(int diameter, String typeOfMaterial) {
		super();
		this.diameter = diameter;
		this.typeOfMaterial = typeOfMaterial;
	}


	public int getDiameter() {
		return diameter;
	}


	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}


	@Override
	public String toString() {
		return "diameter=" + diameter + ", typeOfMaterial=" + typeOfMaterial ;
	}
	
	

}
