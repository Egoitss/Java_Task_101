package nodarbiba_1;

import java.util.Arrays;

public class t16NulluParvietosana {

	public static void main(String[] args) {

		System.out.println("Masîva kâpinâðana 3 pakâpç");
		System.out.println(" ");
		int[] masivs = { 0, 4, 0, 7, 8, 9, 0, 1 };
		System.out.println("input: " + Arrays.toString(masivs));
		int compl = 0;
		while (true) {
			// assume done
			boolean done = true;
			for (int i = 0; i < masivs.length - 1; i++) {
				compl++;
				int f = masivs[i]; // pirmais
				int s = masivs[i + 1]; // otrais
				if (f == 0 && s != 0) {
					masivs[i] = s;
					masivs[i + 1] = f;
					done = false;
				}

			}

			if (done) {
				break;
			}

		}
		System.out.println("output: " + Arrays.toString(masivs) +" darb skaits: " + compl);
		System.out.println("Masîva kâpinâðana 3 pakâpç");
		System.out.println(" ");
		int[] array = { 0, 4, 0, 7, 8, 9, 0, 1 };
		System.out.println("input: " + Arrays.toString(array));
		int hello = 0;
		while (true) {
			// assume done
			boolean done = true;
			for (int i = 0; i < array.length - 1; i++) {
				hello++;
				int f = array[i]; // pirmais
				int s = array[i + 1]; // otrais
				if (f == 0 && s != 0) {
					array[i] = s;
					array[i + 1] = f;
					done = false;
				}

			}

			if (done) {
				break;
			}

		}
		System.out.println("output: " + Arrays.toString(array) +" darb skaits: " + hello);

	}
}
