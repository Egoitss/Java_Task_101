package nodarbiba_1;

import java.util.Scanner;

public class t06teksta_kombineti {

	public static void main(String[] args) {

		try (Scanner ievade = new Scanner(System.in)) {

			System.out.print("Ievadiet pilsçtas nosaukumu: ");
			String pilseta = ievade.nextLine();
			System.out.print("Ievadiet valsts nosaukumu: ");
			String valsts = ievade.nextLine();

			int pilsLen = pilseta.length();
			int valstsLen = valsts.length();
			if (pilsLen >= valstsLen)
				System.out.println(pilseta + valsts + pilseta);
			else
				System.out.println(valsts + pilseta + valsts);

		}

	}
}