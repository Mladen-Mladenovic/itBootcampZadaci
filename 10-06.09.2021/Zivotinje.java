package domaci09;

public class Zivotinje {
	private String vrsta;
	private String ime;
	private String ishrana;

	public Zivotinje(String vrsta, String ime, String ishrana) {
		this.vrsta = vrsta;
		this.ime = ime;
		this.ishrana = ishrana;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIshrana() {
		return ishrana;
	}

	public void setIshrana(String ishrana) {
		this.ishrana = ishrana;
	}
	public void stampaj() {
		System.out.println("Vrsta: "+ vrsta+"\nIme: "+ime+"\nIshrana: "+ ishrana);
	}
	
}
