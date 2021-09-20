package loginPageVezba;

import java.util.Scanner;

public class LoginGlavna {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HappyPath hepi = new HappyPath();
		SadPath sed = new SadPath();
		String input = "";

		do {
			System.out.println("Srecna, tuzna ili izlaz? - ");
			input = scan.nextLine();
			switch (input.toLowerCase()) {
			case "srecna":
				hepi.run();
				break;
			case "tuzna":
				sed.run();
				break;
			}
		} while (!input.toLowerCase().equals("izlaz"));
		scan.close();
	}
}
