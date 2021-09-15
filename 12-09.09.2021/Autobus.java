package domaci10;
/*
 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
 * Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. 
 * Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.
 */
import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> listaPutnika = new ArrayList<Putnik>();

	public Autobus(String naziv, double cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
	}

	public void dodajPutnika(Putnik putnik) {
		this.listaPutnika.add(putnik);
	}

	public void ukloniPutnika(Putnik putnik) {
		listaPutnika.remove(putnik);
	}

	public void dodajVozaca(Vozac vozac) {
		this.vozac = vozac;
	}

	public void ukloniVozaca(Vozac vozac) {
		if (this.vozac == vozac) {
			this.vozac = null;
		}
	}

	public void naplatiKartu(Putnik putnik) {
		if (vozac != null) {
			boolean transakcija = putnik.setNovac(-cenaKarte);
			if(transakcija == true) {
				System.out.println("Karta je naplacena putniku "+ putnik.getImeIPrezime() + " u iznosu od " + cenaKarte + "din.");
			}else {
				System.out.println("Naplata za putnika "+ putnik.getImeIPrezime() + " nije uspela, nema dovoljno sredstava na racunu.");
			}
		} else {
			System.out.println("Nije moguce naplatiti kartu\nVozac nije prisutan.");
		}
	}

	public ArrayList<Putnik> getListaPutnika() {
		return listaPutnika;
	}

	@Override
	public String toString() {

		String imeVozaca;
		if (vozac == null) {
			imeVozaca = "Nema vozaca";
		} else {
			imeVozaca = vozac.getImeIPrezime();
		}
		return "Autobus - Naziv: " + naziv + " - Vozac: " + imeVozaca + " - Cena Karte: " + cenaKarte;
	}
}
