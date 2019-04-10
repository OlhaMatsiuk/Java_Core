package logos;

public class Main {

	public static void main(String[] args) {
		
		//Object []array = {44,5,9,-11,17,12,67,87,66,102};
		
		Object []array = {2,3,4,-5,6,20,-11,0,34,100};
		Collection col = new Collection(array);
		
		
		System.out.println(" asc ");
		System.out.println();
		
		Iterator iteratorForward = col.createForward();
		while(iteratorForward.hasNext()) {
			
			System.out.println(iteratorForward.next());	
		}
		
		System.out.println();
		System.out.println(" dsc ");
		System.out.println();
		
		Iterator iteratorBackward = col.createBackward();
		while(iteratorBackward.hasNext()) {
			
			System.out.println(iteratorBackward.next());
		}
		
		System.out.println();
		System.out.println("Значення масиву від першого до останнього. Заміну непарних елементів на нуль");
		System.out.println();
		
		Iterator iteratorWithoutNeg = col.createForwardWithoutNeg();
		while(iteratorWithoutNeg.hasNext()) {
			
			System.out.println(iteratorWithoutNeg.next());
		}
		
		System.out.println();
		System.out.println("Від останнього до першого елементу. Значення через одну цифру.");
		System.out.println();
		
		Iterator iteratorBackwardByTwo= col.createBackwardByTwo();
		while(iteratorBackwardByTwo.hasNext()) {
			
			System.out.println(iteratorBackwardByTwo.next());
		}
		
		System.out.println();
		System.out.println("Від останнього до першого елементу. Кожен третій елемент масиву від останнього чи він непарний");
		System.out.println();

		
		Iterator createAnon= col.createBackAnon();
		while(createAnon.hasNext()) {
			
			System.out.println(createAnon.next());
		}
		
		
		System.out.println();
		System.out.println("Від першого до останнього елементу масиву. Кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100");
		System.out.println();
		
		Iterator forwardByFive= col.creatForwardByFive();
		while(forwardByFive.hasNext()) {
			
			System.out.println(forwardByFive.next());
		}
		
		
		System.out.println();
		System.out.println("Від першого до останнього елементу масиву. Кожен другий, якщо він парний,тоді зробити з нього непарний ");
		System.out.println();
		
		Iterator ForwardByTwoNeg= col.createForwardByTwoNeg();
		while(ForwardByTwoNeg.hasNext()) {
			
			System.out.println(ForwardByTwoNeg.next());
		}
		
		
		
	}
	
}
