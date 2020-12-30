package nodarbiba_1;

import java.util.Arrays;

public class T20RandomString {

	public static void main(String[] args) {

		String[] array = { "aDs", "add", "dd", "eee" };

		System.out.print(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 2) {
				array[i] = array[i].toUpperCase();
			}
		}
		System.out.print(" --> "+Arrays.toString(array));
	}

}
