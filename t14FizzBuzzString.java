package nodarbiba_1;

public class t14FizzBuzzString {

	public static void main(String[] args) {

		System.out.println("Masîvu apstrâde: Fizz Buzz!!!");
		System.out.println(" ");
		String[] masivs = { "1", "2", "3", "5", "8", "30", "15", "12", "7" };
		int size = masivs.length;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(masivs[i]);
		}
		for (int i = 0; i <= size - 1; ++i) {
			if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
				masivs[i] = "FizzBuzz";
			} else if (arr[i] % 3 == 0) {
				masivs[i] = "Fizz";
			} else if (arr[i] % 5 == 0) {
				masivs[i] = "Buzz";
			}
			System.out.print(" " + masivs[i]);
		}

	}

}
