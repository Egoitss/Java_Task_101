package nodarbiba_1;

import java.util.Scanner;

public class t09Skaitlis_atbilst_menesim {

	public static void main(String[] args) {

		Scanner ievade = new Scanner(System.in);

		System.out.print("Ievadiet jebkuru veselu skaitli no 1 - 12: ");
		int menesis = ievade.nextInt();
		ievade.close();
		String menesaNosaukums;
		switch (menesis) {
		case 1:
			menesaNosaukums = "Janv�ris";
			break;
		case 2:
			menesaNosaukums = "Febru�ris";
			break;
		case 3:
			menesaNosaukums = "Marts";
			break;
		case 4:
			menesaNosaukums = "Apr�lis";
			break;
		case 5:
			menesaNosaukums = "Maijs";
			break;
		case 6:
			menesaNosaukums = "J�nijs";
			break;
		case 7:
			menesaNosaukums = "J�lijs";
			break;
		case 8:
			menesaNosaukums = "Augusts";
			break;
		case 9:
			menesaNosaukums = "Septembris";
			break;
		case 10:
			menesaNosaukums = "Oktobris";
			break;
		case 11:
			menesaNosaukums = "Novembris";
			break;
		case 12:
			menesaNosaukums = "Decembris";
			break;
		default:
			menesaNosaukums = "Neatbilsto�s skaitlis!!!";
			break;
		}
		System.out.println(menesaNosaukums);

	}
}
