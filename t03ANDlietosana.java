package nodarbiba_1;

import java.util.Scanner;

public class t03ANDlietosana {

	public static void main(String[] args) {

		try (Scanner ievade = new Scanner(System.in)) {

			System.out.print("Ievadiet jebkuru veselu skaitli x: ");
			int x = ievade.nextInt();
			System.out.print("Ievadiet jebkuru veselu skaitli y: ");
			int y = ievade.nextInt();
			int z = x + y;
			if (z >= 10 && z <= 20) {
				z = 20;
				System.out.println(z);
			} else {
				System.out.println(z);
			}

		}

	}
}