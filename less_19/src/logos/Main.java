package logos;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)  throws IOException, ClassNotFoundException {
		
		File file = new File("employee.txt");
		Employee employee = new Employee("Olha",13,500.0);
		Methods.serialize(employee, file);
		System.out.println(Methods.deserealize(file));
		
		System.out.println();
		
		File file2 = new File("employeeList.txt");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		employeeList.add(new Employee("Bogdan",4,1000));
		employeeList.add(new Employee("Vika",28,100));
		
		Methods.serialize((Serializable) employeeList, file2);
		List<Employee> employeeList2 = new ArrayList<Employee>();
		employeeList2 = (List<Employee>) Methods.deserealize(file2);
		
		for (Employee e: employeeList2) {
			System.out.println(e);
		}
		

	}
	
}
