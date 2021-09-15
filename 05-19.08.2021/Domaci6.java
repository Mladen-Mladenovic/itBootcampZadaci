package primer4;

import java.util.Scanner;

public class Domaci6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double broj;
		double zbir = 0;

		do {
			System.out.println("Unesite broj za zbir:");
			broj = scan.nextDouble(); // 0; 1; 2; -1;
			if (broj >= 0) {
				zbir += broj;
			}
		} while (broj >= 0);
		System.out.println("Zbir je: " + zbir);
		scan.close();
	}

}
