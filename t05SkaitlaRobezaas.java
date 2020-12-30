package nodarbiba_1;

import java.util.Scanner;

public class t05SkaitlaRobezaas {

	public static void main(String[] args) {

		try (Scanner ievade = new Scanner(System.in)) {

			System.out.print("Ievadiet jebkuru veselu skaitli x: ");
			int x = ievade.nextInt();
			
				System.out.println(x>=50 && x<=100);

		}

	}
}