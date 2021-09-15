package domaci10;
/*
 * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
 * Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
 */
public class Putnik extends Covek {
	private double novac;

	public Putnik(String imeIPrezime, double novac) {
		super(imeIPrezime);
		this.novac = novac;
	}

	public boolean setNovac(double iznos) {

		if (this.novac < Math.abs(iznos)) {
			System.out.println("Obavestenje za " + getImeIPrezime()
					+ " Nema dovoljno novca na racunu - Trenutno stanje je: " + this.novac);
			return false;
		} else {
			this.novac += iznos;
			System.out.println("Obavestenje za " + getImeIPrezime() + " - Uspesno izvrsena transakcija u iznosu od: "
					+ iznos + " - Trenutno stanje na racunu je: " + this.novac);
			return true;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " - Novac: " + novac;
	}
}
