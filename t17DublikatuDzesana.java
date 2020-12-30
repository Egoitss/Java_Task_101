package nodarbiba_1;

import java.util.Arrays;

public class t17DublikatuDzesana {

	public static void main(String[] args) {

		System.out.println("Dublikâtu izdzçðana!!! ");
		System.out.println(" ");
		String[] arrayInput = { "ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO" };
		System.out.println("input:  " + Arrays.toString(arrayInput));

		int newSize = arrayInput.length;
		for (int i = 0; i < newSize - 1; i++) {
			String key = arrayInput[i];
			for (int j = i + 1; j < newSize; j++) {

				if (key == arrayInput[j]) {
					newSize = newSize - 1;
					for (int k = j; k < newSize; k++) {
						arrayInput[k] = arrayInput[k + 1];
					}
					j--;
				}

			}
		}
		String[] arrayOutput = new String[newSize]; 
	

		for (int p = 0; p < newSize; p++) {
			arrayOutput[p] = arrayInput[p];

		}
		System.out.println("output: " + Arrays.toString(arrayOutput));
	}
}
