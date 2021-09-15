package vezba09b;

public class VideoPlayer {

	private int duzinaVidea;
	private int trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea;

	public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}

	public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	public void stampaj() {
		System.out.println("Trenutno vreme videa: " + trenutnoVremeVidea + " min\nJacina zvuka: " + jacinaZvuka
				+ "%\nKvalitet videa: " + kvalitetVidea+ "p");
	}
}
