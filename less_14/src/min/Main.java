package min;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("Olha",18));
		set.add(new Person("Vika",19));
		set.add(new Person("Natali",10));
		set.add(new Person("Bodya",20));
		set.add(new Person("Dima",25));
		
		for (Person person : set) {
			System.out.println(person);
		}
		
		System.out.println();

		Set<Person> set2 = new TreeSet<Person>(new PersonComparatorAllFields());
		
		set2.add(new Person("Olha",18));
		set2.add(new Person("Vika",19));
		set2.add(new Person("Natali",10));
		set2.add(new Person("Bodya",20));
		set2.add(new Person("Dima",25));
		
		for (Person person : set2) {
			System.out.println(person);
		}
		
		
		
	}

}
