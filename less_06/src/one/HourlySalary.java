package one;

public class HourlySalary implements Salary{

	private int day;
	private int hours;
	private double hourlySalary;
	
	HourlySalary(int day, int hours,double hourlySalary){
		this.day = day;
		this.hours = hours;
		this.hourlySalary = hourlySalary;
	}
	
	@Override
	public void salary(){
		
		 System.out.println("Hourly Salary = " + day*hours*hourlySalary);
		
	}

}
