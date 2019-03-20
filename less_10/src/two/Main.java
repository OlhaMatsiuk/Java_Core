package two;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
	
		char [] arrayChar = {'a','e','o','y','u','i','A','E','O','Y','U','I'};
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Введіть слово : ");

		String ourStr = scan.nextLine();
		
		char [] arrayWord = ourStr.toCharArray();
		
		boolean flag = true;
		
		for(int i = 0; i < arrayWord.length; i++) {
			
			for(int j = 0; j < arrayChar.length; j++) {
				
				if(arrayWord[i] == arrayChar[j]) 
					arrayWord[i] = '-';
				
				
			}
			
		}
		
		System.out.println(arrayWord);
		
		
	}
	
}
