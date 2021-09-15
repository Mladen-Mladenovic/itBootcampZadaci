package primer5;

import java.util.Scanner;

public class Domaci7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// String[] grad = { "Beograd", "Novi Sad", "Nis", "Kragujevac", "Kraljevo" };

		String[] grad = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Unesite grad [" + (i + 1) + " od 5]:");
			grad[i] = scan.nextLine();
		}

		for (int i = 1; i < grad.length - 1; i++) {
			System.out.println("\n\t" + grad[i]);
		}
	}
}
