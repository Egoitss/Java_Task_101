package nodarbiba_1;

import java.util.Arrays;

public class T19Magic_square {

	public static void main(String[] args) {

		System.out.println("Maìiskâ kvadrâta pârbaude!!! ");
		int[][] arrayInput = { { 17, 10, 15 }, { 12, 14, 16 }, { 13, 18, 11 } };
		// int[][] arrayInput = { { 5, 4, 1 }, { 1, 9, 7 }, { 5, 2, 8 } };
		// int[][] arrayInput = { { 17, 10, 15 }, { 12, 14, 16 } };
		int rowLen = 0;
		int colLen = 0;
		for (int i = 0; i < arrayInput.length; i++) { // masîva rinda .
			for (int j = 0; j < arrayInput[i].length; j++) { // masîva kollona.
				System.out.print(arrayInput[i][j] + " ");
				if (i <= 0)
					colLen++;
			}
			rowLen++;
			System.out.println();
		}
		if (colLen != rowLen) {
			System.err.println("Masîvs nav maìiskais kvadrâts!!!");
		} else {

			int[] newArray1 = new int[arrayInput.length];
			for (int i = 0; i < arrayInput.length; i++) {
				int numbers = 0;
				for (int j = 0; j < arrayInput.length; j++) {
					numbers = numbers + arrayInput[i][j];
				}
				newArray1[i] = numbers;
			}

			System.out.println("Rindu summa: " + Arrays.toString(newArray1));

			int[] newArray2 = new int[arrayInput.length];
			for (int i = 0; i < arrayInput.length; i++) {
				int numbers = 0;
				for (int j = 0; j < arrayInput.length; j++) {
					numbers = numbers + arrayInput[j][i];
				}
				newArray2[i] = numbers;

			}

			// for (int h = 0; h < newArray2.length; h++) {
			// for (int k = 0; k < newArray2.length; k++) {
			// if (newArray2[h] != newArray2[k]) {
			// }
			// }
			// }
			System.out.println("Kolonnu summa: " + Arrays.toString(newArray2));
			if (Arrays.equals(newArray1, newArray2)) {
				System.out.println("Kvadrâts ir maìisks!!!");

			} else {
				System.err.println("Masîvs nav maìiskais kvadrâts!!!");
			}
		}
	}
}
