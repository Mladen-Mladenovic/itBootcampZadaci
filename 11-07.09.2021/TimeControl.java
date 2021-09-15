package vezba09b;

public class TimeControl extends Control {
	private boolean pomeraVreme; // true unapred, false unazad

	public TimeControl(boolean pomeraVreme) {
		super();
		this.pomeraVreme = pomeraVreme;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (!pomeraVreme) {
			if (player.getTrenutnoVremeVidea() > 15) {
				player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() - 15);
			} else {
				player.setTrenutnoVremeVidea(0);
			}
		} else {
			if (player.getDuzinaVidea() - player.getTrenutnoVremeVidea() > 15) {
				player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() + 15);
			} else {
				player.setTrenutnoVremeVidea(player.getDuzinaVidea());
			}

		}
	}
}
