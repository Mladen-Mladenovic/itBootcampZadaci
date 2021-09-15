package primer4;

import java.util.Scanner;

public class Domaci6b {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = "";
		System.out.println("Unesite broj redova: ");
		int broj = scan.nextInt();
		scan.close();

		for (int i = 0; i < broj; i++) {
			s += "*";
			System.out.println(s);
		}
	}
}
