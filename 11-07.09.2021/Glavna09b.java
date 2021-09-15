package vezba09b;

import java.util.ArrayList;

public class Glavna09b {

	public static void main(String[] args) {

		VideoPlayer p1 = new VideoPlayer(90, 0, 50, 240);
		VideoPlayer p2 = new VideoPlayer(40, 20, 40, 144);

		QualityOptimizerControl qual1 = new QualityOptimizerControl(200);
		TimeControl t1 = new TimeControl(true);
		AudioControl a1 = new AudioControl(false);

		p1.stampaj();
		System.out.println("");

		qual1.izvrsiAkciju(p1);
		t1.izvrsiAkciju(p1);
		a1.izvrsiAkciju(p1);
		t1.izvrsiAkciju(p1);
		p1.stampaj();

		System.out.println("");

		ArrayList<Control> akcije = new ArrayList();
		akcije.add(qual1);
		akcije.add(t1);
		akcije.add(a1);

		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(p2);
		}
		p2.stampaj();

	}

}
