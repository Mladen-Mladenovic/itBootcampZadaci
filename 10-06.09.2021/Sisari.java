package domaci09;

public class Sisari extends Zivotinje {

	private String bojaDlake;
	private String utilizacija;

	public Sisari(String vrsta, String ime, String ishrana, String bojaDlake, String utilizacija) {
		super(vrsta, ime, ishrana);
		this.bojaDlake = bojaDlake;
		this.utilizacija = utilizacija;
	}

	public void stampaj() {
		super.stampaj();
		System.out.println(
				"Boja dlake im je " + bojaDlake + "\nA ljudi ih klasifikuju kao " + utilizacija + " zivotinje.");
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getUtilizacija() {
		return utilizacija;
	}

	public void setUtilizacija(String utilizacija) {
		this.utilizacija = utilizacija;
	}

}
