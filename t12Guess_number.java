package nodarbiba_1;

import java.util.Scanner;

public class t12Guess_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random1 = (int) (Math.random() * 9 + 1);

		System.out.println("Es izv�l�jos skaitli no 1 l�dz desmit, pam��ini to uzmin�t!");
		// System.out.println("Skaitlis ir: " + random1);
		int x;
		do {
			System.out.print("Ievadiet skaitli no 1 l�dz 10: ");
			x = sc.nextInt();
			
			if (x == random1) {
				System.out.println("Pareizi, cipars ir: " + x);

			} else if (x < random1) {
				System.out.println("N�, skaitlis ir liel�ks par j�su nosaukto!");

			} else {
				System.out.println("N�, skaitlis ir maz�ks par j�su nosaukto!");
			}
		} while (x != random1);
		sc.close();
	}
}
