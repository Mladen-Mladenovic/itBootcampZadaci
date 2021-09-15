package Zadatak1;

public class Automobil {
	public String marka;
	public String model;
	public int godiste;
	private int predjeniKm;
	public int potrosnja;
	private int kubikaza;
	public int cenaGoriva = 120;
	private int ukupnoZaGorivo;

	public Automobil() {

	}

	public Automobil(String marka, String model, int godiste) {
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}

	public void setKubikaza(int kubik) {
		this.kubikaza = kubik;
		if (this.kubikaza > 1000) {
			this.potrosnja = 10;
		} else {
			this.potrosnja = 8;
		}
	}

	public int getPotrosnja() {
		return this.potrosnja;
	}
	
	public void setUkupnoZaGorivo() {
		// (int) u formuli ispod vraca rezultat u int, jer ga on sam promeni na double kada podeli potrosnju sa 100.0
		this.ukupnoZaGorivo = (int) ((this.potrosnja / 100.0) * cenaGoriva) * this.predjeniKm;
	}

	public void stampaj() {
		this.setUkupnoZaGorivo();
		System.out.println("Marka je: " + marka + "\nModel je: " + model + "\nGodiste je: " + godiste + "\nPresao je: "
				+ predjeniKm + "km\nSa potrosnjom od " + potrosnja + "l\nUkupno je za gorivo potroseno: "
				+ ukupnoZaGorivo + " rsd.");

	}
}