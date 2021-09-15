package domaci10;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {

		Covek c1 = new Covek("Pera Peric");
		System.out.println(c1);

		Vozac v1 = new Vozac("Neki Vozac");
		System.out.println(v1);

		Putnik p1 = new Putnik("Prvi Putnik", 300);
		Putnik p2 = new Putnik("Drugi Putnik", 500);

		System.out.println("\n" + p1 + "\n" + p2);

		Autobus a1 = new Autobus("ImePrevoznika", 300);

		a1.dodajPutnika(p1);
		a1.dodajPutnika(p2);

		System.out.println("\n" + a1);

		
		a1.naplatiKartu(p1);
		
		System.out.println("");
		
		a1.dodajVozaca(v1);
		ArrayList<Putnik> lista = a1.getListaPutnika();

		for (int i = 0; i < lista.size(); i++) {
			a1.naplatiKartu(lista.get(i));
		}
		
		System.out.println("");
		a1.naplatiKartu(p1);

	}

}
