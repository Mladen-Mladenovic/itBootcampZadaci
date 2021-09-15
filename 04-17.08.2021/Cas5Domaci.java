package primer03;

import java.util.Scanner;

public class Cas5Domaci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String glavni;
		String drzava;

		do {

			System.out.println("Izaberi drzavu:\nFrancuska \tItalija \tSrbija  \tIzlaz");
			drzava = scan.next();

			switch (drzava.toLowerCase()) {
			case "francuska":

				System.out.println("Koji je glavni grad Francuske?");
				glavni = scan.next();

				if (glavni.equals("Pariz") || glavni.equals("pariz")) {
					System.out.println("Odgovor je tacan\n");
				} else {
					System.out.println("Odgovor nije tacan\n");
				}
				break;

			case "italija":

				System.out.println("Koji je glavni grad Italije");
				glavni = scan.next();

				if (glavni.equals("Rim") || glavni.equals("rim")) {
					System.out.println("Odgovor je tacan\n");
				} else {
					System.out.println("Odgovor nije tacan\n");
				}
				break;

			case "srbija":

				System.out.println("Koji je glavni grad Srbije");
				glavni = scan.next();

				if (glavni.equals("Beograd") || glavni.equals("beograd")) {
					System.out.println("Odgovor je tacan\n");
				} else {
					System.out.println("Odgovor nije tacan\n");
				}
				break;

			case "izlaz":
				break;
			}

		} while (!drzava.equals("Izlaz") && !drzava.equals("izlaz"));
		scan.close();
	}

}
