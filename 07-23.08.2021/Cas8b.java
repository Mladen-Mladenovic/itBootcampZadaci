// Zadatak 3
package primer6;

import java.util.Scanner;

public class Cas8b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] unos = new int[3];
		for (int i = 0; i < unos.length; i++) {
			System.out.println("Unesi broj:");
			unos[i] = scan.nextInt();
		}
		scan.close();

		int zbir = sabiranje(unos);
		int max = maksimum(unos);
		System.out.println("\nZbir unetih brojeva je: " + zbir + "\nNajveci broj je: " + max);

	}

	private static int sabiranje(int[] unos) {
		int zbir = unos[0];
		for (int i = 1; i < unos.length; i++) {
			zbir += unos[i];
		}
		return zbir;
	}

	private static int maksimum(int[] unos) {
		int max = unos[0];
		for (int i = 0; i < unos.length; i++) {
			if (max < unos[i]) {
				max = unos[i];
			}
		}
		return max;
	}
}
