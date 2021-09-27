package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageImdb {

	WebDriver driver;
	WebDriverWait wait;
	WebElement emailField;
	WebElement passwordField;
	WebElement signInButton;
	String loginPageUrl = "https://www.imdb.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.imdb.com%2Fregistration%2Fap-signin-handler%2Fimdb_us&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=imdb_us&openid.mode=checkid_setup&siteState=eyJvcGVuaWQuYXNzb2NfaGFuZGxlIjoiaW1kYl91cyIsInJlZGlyZWN0VG8iOiJodHRwczovL3d3dy5pbWRiLmNvbS8_cmVmXz1sb2dpbiJ9&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&tag=imdbtag_reg-20";

	public LoginPageImdb(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("ap_password"));
	}

	public WebElement getSignInButton() {
		return driver.findElement(By.id("signInSubmit"));
	}

	public void insertEmail(String email) {
		getEmailField().clear();
		getEmailField().sendKeys(email);
	}

	public void insertPassword(String password) {
		getPasswordField().clear();
		getPasswordField().sendKeys(password);
	}

	public void clickLoginButton() {
		getSignInButton().click();
	}

	public void goToLoginPage() {
		driver.navigate().to(loginPageUrl);
	}

	public boolean checkIfloggedIn(String username) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='" + username + "']")));
			if (driver.findElement(By.xpath("//span[text()='mladenm']")).isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception NoSuchElementException) {
			return false;

		}
	}

}
