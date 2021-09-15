package vezba09b;

public class AudioControl extends Control {
	private boolean variraZvuk; // true pojacava, false smanjuje

	public AudioControl(boolean variraZvuk) {
		super();
		this.variraZvuk = variraZvuk;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (!this.variraZvuk) {
			if (player.getJacinaZvuka() > 0) {
				player.setJacinaZvuka(player.getJacinaZvuka() - 1);
			} else {
				System.out.println("Zvuk iskljucen");
			}
		} else {
			if (player.getJacinaZvuka() < 100) {
				player.setJacinaZvuka(player.getJacinaZvuka() + 1);
			} else {
				System.out.println("Zvuk je maksimalno pojacan.");
			}
		}

	}

}
