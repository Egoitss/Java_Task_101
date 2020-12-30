package nodarbiba_1;

import java.util.Scanner;

public class t08Izvada_skaitlus_kas_dalas_ar {

	public static void main(String[] args) {

		try (Scanner ievade = new Scanner(System.in)) {

			System.out.print("Ievadiet jebkuru veselu skaitli x: ");
			int x = ievade.nextInt();
			System.out.print("Ievadiet jebkuru veselu skaitli y: ");
			int y = ievade.nextInt();
			String izvade = "";
			if (x <= y) {
				for (int i = x; i <= y; i++)
					if (i % 2 == 0 && i % 3 == 0 && i % 5 != 0)
						izvade = izvade + i;
			} else {
				for (int z = y; z <= x; z++)
					if (z % 2 == 0 && z % 3 == 0 && z % 5 != 0)
						izvade = izvade + z; 
			}
			System.out.println(izvade);
		}
	}

}
