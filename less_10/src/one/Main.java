package one;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть слово : ");

		String str = scan.next();

		boolean flag = true;

		if (str.length() == 5) {
			
			int i = 0;

			while (i < str.length() && flag) {

				if (
						str.toLowerCase().charAt(i) == 
						str.toLowerCase().charAt(str.length() - i-1)
					)
				i++;
				else flag = false;
			}
			
			if(flag)System.out.println("Yes");
			else System.out.println("No");

		} else throw new Exception("error");
	}
}
