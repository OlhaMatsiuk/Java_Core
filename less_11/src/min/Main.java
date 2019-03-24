package min;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Integer[] array = new Integer[getRandom(1, 10)];

		for (int i = 0; i < array.length; i++) {
			array[i] = getRandom(5, 35);
		}

		System.out.println(Arrays.deepToString(array));

		System.out.println("\nSort asc: \n");

		Arrays.sort(array);

		System.out.println(Arrays.deepToString(array));

		System.out.println("\nSort desc: \n");

		Arrays.parallelSort(array, Collections.reverseOrder());

		System.out.println(Arrays.deepToString(array));

	}

	public static int getRandom(int min, int max) {

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}

}
