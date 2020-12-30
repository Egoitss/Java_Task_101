package nodarbiba_1;



public class t13Divciparu_skaitlu_summas {

	public static void main(String[] args) {
		System.out.println("Programma, kas izvada visu divciparu skaitïu summas!");

		for (int i = 10; i <= 99; i++) {
			int s1 = i / 10;
			int s2 = i % 10;
			int rez = s1+s2; 
			System.out.println(i + ": " + s1 + "+" + s2 + "=" + rez);
		}

	}
}


