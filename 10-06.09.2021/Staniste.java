package domaci09;

public class Staniste {

	private String[] stanovnici;
	private String naziv;

	public Staniste(String[] stanovnici, String naziv) {
		super();
		this.stanovnici = stanovnici;
		this.naziv = naziv;
	}

	public String[] getStanovnici() {
		return stanovnici;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setStanovnici(String[] stanovnici) {
		this.stanovnici = stanovnici;
	}

	public void stampaj() {
		System.out.println("Ovo staniste se zove: " + naziv + "\nU njemu stanistu zive:");
		for (int i = 0; i < stanovnici.length; i++) {
			System.out.print(stanovnici[i] + ", ");
		}
	}
}
