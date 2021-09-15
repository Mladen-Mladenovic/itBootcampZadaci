// Zadatak 2
package primer6;

import java.util.Scanner;

public class Cas8a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] unos = new int[3];
		for (int i = 0; i < unos.length; i++) {
			System.out.println("Unesi broj:");
			unos[i] = scan.nextInt();
		}
		scan.close();

		int prod = product(unos);
		System.out.println("\nProizvod unetih brojeva je: " + prod);
	}

	private static int product(int[] unos) {
		int prod = unos[0];
		for (int i = 1; i < unos.length; i++) {
			prod *= unos[i];
		}
		return prod;
	}

}
