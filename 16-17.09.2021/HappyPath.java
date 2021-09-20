package loginPageVezba;

public class HappyPath extends Test {

	private String username;
	private String password;

	public HappyPath() {
		this.username = "tomsmith";
		this.password = "SuperSecretPassword!";
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean run() {
		return super.test(username, password);
	}
}
