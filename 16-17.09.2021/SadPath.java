package loginPageVezba;

public class SadPath extends Test {
	private String username;
	private String password;

	public SadPath() {
		this.username = "losiUsername";
		this.password = "losaSifra";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean run() {
		return super.test(username, password);
	}
}
