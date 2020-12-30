package nodarbiba_1;

import java.util.Scanner;

public class t12Guess_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random1 = (int) (Math.random() * 9 + 1);

		System.out.println("Es izvçlçjos skaitli no 1 lîdz desmit, pamçìini to uzminçt!");
		// System.out.println("Skaitlis ir: " + random1);
		int x;
		do {
			System.out.print("Ievadiet skaitli no 1 lîdz 10: ");
			x = sc.nextInt();
			
			if (x == random1) {
				System.out.println("Pareizi, cipars ir: " + x);

			} else if (x < random1) {
				System.out.println("NÇ, skaitlis ir lielâks par jûsu nosaukto!");

			} else {
				System.out.println("NÇ, skaitlis ir mazâks par jûsu nosaukto!");
			}
		} while (x != random1);
		sc.close();
	}
}
