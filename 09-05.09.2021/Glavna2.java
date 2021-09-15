package domaciZaRaspust;
import java.util.Scanner;
import java.util.ArrayList;
public class Glavna2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList filmovi = new ArrayList();
		
		Glumci glumac1 = new Glumci("Pera Peric", 1978, "muski", false, 100000, 15);
		glumac1.stampaj();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Unesite film sa prefiksom njegove ocene na imdb-u\nU formatu ocena_imeFilma (5.2_ImeFilma):");
			String film = scan.nextLine();
			glumac1.setFilmovi(film);
		}
		System.out.println("\n\n");
		
		ArrayList filmoviSredjeni = glumac1.getFilmoviPoOceni();
		for(int i = 0; i < filmoviSredjeni.size(); i++) {
			System.out.println(filmoviSredjeni.get(i));
		}
	
	}

}
