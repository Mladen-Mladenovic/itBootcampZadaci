package domaci09;

public class Glavna {

	public static void main(String[] args) {
		Ribe r1 = new Ribe("kicmenjak", "nekoIme", "nekaHrana", "slatka", 5, "nekaPeraja");
		Sisari s1 = new Sisari("kicmenjak", "imeZaSisara", "ishranaZaSisara", "smedja", "domaca");
		
		String[] spisakZivotinja = {"zivotinja1", "zivotinja2", "zivotinja3"};
		Staniste staniste = new Staniste(spisakZivotinja, "nazivStanista");
	
		
		r1.stampaj();
		System.out.println("");
		s1.stampaj();
		s1.setBojaDlake("bela");
		System.out.println("");
		s1.stampaj();
		System.out.println("");
		staniste.stampaj();
	}
}
