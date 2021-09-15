// Zadatak 1
package primer6;

import java.util.Scanner;

public class Cas8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] unos = new int[3];
		for (int i = 0; i < unos.length; i++) {
			System.out.println("Unesi broj:");
			unos[i] = scan.nextInt();
		}
		scan.close();

		int min = minimum(unos);
		System.out.println("\nNajmanji broj je: " + min);

	}

	private static int minimum(int[] unos) {
		int min = unos[0];
		for (int i = 0; i < unos.length; i++) {
			if (min > unos[i]) {
				min = unos[i];
			}
		}
		return min;
	}
}
