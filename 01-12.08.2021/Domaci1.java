package primer01;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ime = "Mladen";
		String prezime = "Mladenovic";
		char gender = 'M';
		
		System.out.println(ime + " "+ prezime + "\n" + gender);

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesi ukupan broj medalja koje je Srbija osvojila na OI: ");
		float ukupno = scan.nextFloat();
		System.out.println("Unesi broj zlatnih medalja koje je Srbija osvojila na OI: ");
		float zlato = scan.nextFloat();
		scan.close();
		
		float procenatZlatUk = zlato / ukupno * 100;
		System.out.println("Od ukupnog broja medalja koje je osvojila Srbija, \nzlatnih je " +procenatZlatUk +"%");
		
	}

}
