package izg.domaci;

import java.util.Scanner;

public class Domaci04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Unesi broj:");
		int broj = scan.nextInt();
		int zbir = 0;

		while (broj > 0) {
			zbir += broj;
			System.out.println("Unesi broj:");
			broj = scan.nextInt();
		}
		System.out.println("Zbir je: " + zbir);
	}

}
