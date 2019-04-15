package min;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		// В List<Integer> можна додати елементи тільки типу Integer
		list.add(new Integer(13));
		list.add(13);	
		
		// Також можна використовувати тип string перетворивши його, автоматично використається метод parseInt
		list.add(new Integer ("13"));
		
		//list.add(new Integer ("13aa"));  помилка, бо неможливо перетворити в цілочисельний тип
		//list.add("13");  помилка, бо не використали приведення до Integer
		
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.getClass());
		System.out.println(list.get(0).getClass());
		System.out.println("12".getClass());
		
	}

}
