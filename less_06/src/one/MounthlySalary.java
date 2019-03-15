package one;

public class MounthlySalary 
	implements Salary{
		
		private int mounthlySalary;
		private int day;
		
		MounthlySalary(int mounthlySalary, int day){
			this.mounthlySalary = mounthlySalary;
			this.day = day;
		}

		@Override
		public void salary() {
			System.out.println("Mounthly Salary = "+ mounthlySalary/31*day); 
		}
}
