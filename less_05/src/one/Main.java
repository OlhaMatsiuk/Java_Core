package one;

public class Main {
	
	public static void main(String[] args) {

		Pet cow = () -> "Мууу";
		Pet cat = () -> "Мяууу";
		Pet dog = () -> "Гав-гавс";

		v(cow.voice(), "Зося");
		v(cat.voice(), "Мія");
		v(dog.voice(), "Блек");

	}

	public static void v(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}

}
