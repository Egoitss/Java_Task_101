package nodarbiba_1;

import java.util.Scanner;

public class t04ifElseIf {

	public static void main(String[] args) {

		try (Scanner ievade = new Scanner(System.in)) {

			System.out.print("Ievadiet jebkuru veselu skaitli x: ");
			int x = ievade.nextInt();
			System.out.print("Ievadiet jebkuru veselu skaitli y: ");
			int y = ievade.nextInt();
			System.out.print("Ievadiet jebkuru veselu skaitli z: ");
			int z = ievade.nextInt();

			if (x == y && y == z) {
				x = 0;
				y = 0;
				z = 0;
				System.out.println(x + y + z);
			} else if (x == y) {
				y = 0;
				x = 0;
				System.out.println(x + y + z);
			} else if (y == z) {
				y = 0;
				z = 0;
				System.out.println(x + z + y);
			} else if (x == z) {
				x = 0;
				z = 0;
				System.out.println(x + z + y);
			} else
				System.out.println(x + y + z);

		}

	}
}