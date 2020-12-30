package nodarbiba_1;

import java.util.Scanner;

public class t11Reizinasanas_tabula {

	public static void main(String[] args) {
		try (Scanner ievade = new Scanner(System.in)) {
			System.out.println("Skaitïa reizinâðanas tabula lîdz nosauktajam skaitlim!!!");
			System.out.print("Ievdiet skaitli x: ");
			int x = ievade.nextInt();

			for (int i = 0; i <= x; i++) {
				int rez = x * i;
				System.out.println(x + "x" + i + "=" + rez);
			}
		}
	}
}
