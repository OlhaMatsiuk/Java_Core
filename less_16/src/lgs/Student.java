package lgs;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public  class Student extends Person implements Serializable  {

	public String name;
	public int numberOfStudyYears;
	private Map <String, Integer> diploma = new HashMap<>();
	
	
	public Student(){}
	
	public Student(Map<String, Integer> dip){
		this.diploma = dip;
	}

	public Student(String name, int numberOfStudyYears, Map<String, Integer> dip) {
		super();
		this.name = name;
		this.numberOfStudyYears = numberOfStudyYears;
		this.diploma = dip;
	}
	
	public void UpYears(String name, int number) {
		
		this.name = name;
		this.numberOfStudyYears = numberOfStudyYears + number;
		
		System.out.println("Student " + name + " studying " + numberOfStudyYears + " years!");
		
	}
	
	
	public void replaceLevel(int number) {
		
		this.numberOfStudyYears = number;
		
		System.out.println("Student " + name + " studying " + numberOfStudyYears + " years!");

	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfStudyYears() {
		return numberOfStudyYears;
	}

	public void setNumberOfStudyYears(int numberOfStudyYears) {
		this.numberOfStudyYears = numberOfStudyYears;
	}

	public Map<String, Integer> getDiploma() {
		return diploma;
	}

	public void setDiploma(Map<String, Integer> diploma) {
		this.diploma = diploma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diploma == null) ? 0 : diploma.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfStudyYears;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (diploma == null) {
			if (other.diploma != null)
				return false;
		} else if (!diploma.equals(other.diploma))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfStudyYears != other.numberOfStudyYears)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", numberOfStudyYears=" + numberOfStudyYears + ", diploma=" + diploma + "]";
	}
	
	
	
	
	
}
