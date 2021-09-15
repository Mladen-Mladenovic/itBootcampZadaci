package domaci10;
/*
 * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
 */
public class Vozac extends Covek {
	private String zanimanje;

	public Vozac(String imeIPrezime) {
		super(imeIPrezime);
		this.zanimanje = "sofer";
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Zanimanje: " + zanimanje;
	}
}
