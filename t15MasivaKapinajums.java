package nodarbiba_1;

import static java.lang.Math.*;

public class t15MasivaKapinajums {

	public static void main(String[] args) {

		System.out.println("Masîva kâpinâðana 3 pakâpç");
		System.out.println(" ");
		int[] masivs = { 1, 3, 5, 6, 7 };
		for (int j = 0; j < masivs.length; j++) {
			System.out.print(" " + masivs[j]);

		}
		System.out.println(" ");
		for (int i = 0; i <= masivs.length - 1; i++) {

			System.out.print(" " + (int) pow(masivs[i], 3));
		}

	}

}
