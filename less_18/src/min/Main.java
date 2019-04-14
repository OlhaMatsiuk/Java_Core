package min;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(new Integer(13));
		list.add(13);	
		list.add(new Integer ("13"));
		
		//list.add(new Integer ("13aa"));  помилка
		//list.add("13");  помилка
		
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.getClass());
		System.out.println(list.get(0).getClass());
		System.out.println("12".getClass());
		
	}

}
