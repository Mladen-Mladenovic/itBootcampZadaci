package domaciZaRaspust;

import java.util.ArrayList;

public class Glumci {
	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
	 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 */

	public String imeIPrezime;
	public int godinaRodjenja;
	public String pol;

	private boolean bracniStatus;
	private double prosecnaZarada; // po filmu.
	private int snimnjenihFilmova; // ukupan broj snimnjenih filmova.

	private ArrayList filmovi = new ArrayList();

	public Glumci(String imeIPrezime, int godinaRodjenja, String pol, boolean bracniStatus, double prosecnaZarada,
			int snimnjenihFilmova) {
		this.imeIPrezime = imeIPrezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
		this.bracniStatus = bracniStatus;
		this.prosecnaZarada = prosecnaZarada;
		this.snimnjenihFilmova = snimnjenihFilmova;
	}

	public double ukupnaZarada() {
		return this.prosecnaZarada * this.snimnjenihFilmova;

	}

	public int puneU2022() {
		return 2022 - this.godinaRodjenja;
	}

	public String titula() {
		if (this.pol.equalsIgnoreCase("muski") || this.pol.equalsIgnoreCase("m")) {
			return "Mr.";
		} else if (this.pol.equalsIgnoreCase("zenski") && this.pol.equalsIgnoreCase("z")) {
			return "Mrs.";
		} else {
			return "";
		}
	}

	public void setFilmovi(String film) {
		this.filmovi.add(film);
	}

	public ArrayList getFilmoviPoOceni() {
		ArrayList filmoviSredjeni = new ArrayList();
		int maxIndex = 0;
		String film1;
		String film2;
		String[] razdvoj1 = new String[2];
		String[] razdvoj2 = new String[2];

		for (int i = 0; i < filmovi.size(); i++) { // Pomera prvi selektor za uporedjivanje

			film1 = (String) filmovi.get(i);
			razdvoj1 = film1.split("_"); // Ovdvaja ocenu od imena filma
			Double ocena1 = Double.parseDouble(razdvoj1[0]); // Konvertuje ocenu u double

			for (int j = i + 1; j < filmovi.size(); j++) { // Pomera drugi selektor za uporedjivanje

				film2 = (String) filmovi.get(j);
				razdvoj2 = film2.split("_"); // Ovdvaja ocenu od imena filma
				Double ocena2 = Double.parseDouble(razdvoj2[0]); // Konvertuje ocenu u double

				if (ocena2 > ocena1) {
					maxIndex = j;
					swap(filmovi, maxIndex, i); // Zamenjuje mesta prvom selektoru i filmu sa najvecom ocenom 

				}

			}
		}

		return filmovi;
	}

	public ArrayList swap(ArrayList lista, int index1, int index2) {
	// Zamenjuje pozicije dva elementa
		Object alt = lista.get(index2);
		lista.set(index2, lista.get(index1));
		lista.set(index1, alt);

		return lista;

	}

	public void stampaj() {
		System.out.println(" Ime i prezime: " + titula() + " " + imeIPrezime + "\nGodina rodjenja: " + godinaRodjenja
				+ "\nPol: " + pol + "\nBracni status: " + bracniStatus + "\nProsecna zarada: " + prosecnaZarada
				+ "\nBroj snimnjenih filmova: " + snimnjenihFilmova);

		System.out.println("Ukupna zarada: " + ukupnaZarada() + "\nU 2022. puni " + puneU2022() + " godina\n");
	}

}
