package nodarbiba_1;

import java.util.Scanner;

public class t10StringPAtskanis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet jebkuru burtu: ");
		String chare = sc.nextLine();
		sc.close();
		chare = chare.toLowerCase();

		String patskanisA = "a";
		String patskanisE = "e";
		String patskanisI = "i";
		String patskanisU = "u";
		String divskanisO = "o";
		if (Character.isLetter(chare.charAt(0))) {
			if (chare.equals(patskanisA) || chare.equals(patskanisE) || chare.equals(patskanisI)
					|| chare.equals(patskanisU)) {

				System.out.println("Patskanis");
			} else if (chare.equals(divskanisO)) {
				System.out.println("Patskanis & Divskanis");

			} else {
				System.out.println("Lîdzskanis");
			}
		} else {

			System.err.println("Kïûdas paziòojums!!!");
		}

	}
}
