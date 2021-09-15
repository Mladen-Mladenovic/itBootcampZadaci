package domaci10;
/*
 * Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
 * Svi podaci mogu da se dohvate, ali ne i postave.
 */
public class Covek {
	private String imeIPrezime;

	public Covek(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	@Override
	public String toString() {
		return "Ime i prezime: " + imeIPrezime;
	}
}
