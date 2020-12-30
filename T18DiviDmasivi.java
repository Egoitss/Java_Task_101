package nodarbiba_1;

import java.util.Arrays;

public class T18DiviDmasivi {

	public static void main(String[] args) {

		System.out.println("Divi D masîva lietoðana!!! ");
		System.out.println(" ");
		System.out.println("Student grades input: ");
		int[][] arrayInput = { { 68, 58, 79 }, { 79, 76, 81 } };

		for (int i = 0; i < arrayInput.length; i++) { // masîva rinda .
			System.out.print((i + 1) + ". Student grades: ");
			for (int j = 0; j < arrayInput[i].length; j++) { // masîva kollona.
				System.out.print(arrayInput[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		int i = 0;
		float[] newArray = new float[arrayInput.length];
		do {
			int gradeCount = 0;
			float studentGrades = 0;
			for (int j = 0; j <= arrayInput.length; j++) {
				studentGrades = studentGrades + arrayInput[i][j];
				gradeCount++;
			}
			studentGrades = (float) (Math.round((studentGrades / gradeCount) * 100.0) / 100.0);

			newArray[i] = studentGrades;
			i++;
		} while (i < arrayInput.length);

		System.out.println("Average student grades: " + Arrays.toString(newArray));

	}

}
