package nodarbiba_1;

import java.util.Scanner;

public class t07Naturalu_skaitlu_ivade {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Ievadiet jebkuru veselu skaitli x: ");
			int xievade = sc.nextInt();
			sc.close();
			String izvade = xievade + "--->";
			System.out.println();

			if (xievade >= 0) {
				for (int i = 0; i <= xievade; i++)

					izvade = izvade + i + ",";

			} else {
				for (int i = xievade; i <= 0; i++)

					izvade = izvade + i + ",";

			}
			System.out.print(izvade.substring(0, izvade.length()-1));
		}

	}
}