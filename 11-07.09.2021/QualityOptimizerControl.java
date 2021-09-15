package vezba09b;

import java.lang.Math;

public class QualityOptimizerControl extends Control {
	private int brzinaInterneta;
	int[] kvalitet = { 144, 240, 720 };

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {

		double min = 10000000;
		int index = 0;
		for (int i = 0; i < kvalitet.length; i++) {
			double vrednost = (this.brzinaInterneta * 10.1) - this.kvalitet[i];
			if (Math.abs(vrednost) < min) {
				min = vrednost;
				index = i;
			}
		}
		player.setKvalitetVidea(this.kvalitet[index]);

	}

}
