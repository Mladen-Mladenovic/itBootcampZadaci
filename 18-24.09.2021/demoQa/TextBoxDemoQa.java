package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxDemoQa {

	WebDriver driver;
	WebDriverWait wait;
	WebElement usernameField;
	WebElement emailField;
	WebElement curAddressField;
	WebElement permAddressField;
	WebElement submitBtn;
	WebElement outputName;
	WebElement outputEmail;
	WebElement outputCurAddress;
	WebElement outputPermAddress;

	public TextBoxDemoQa(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("userEmail"));
	}

	public WebElement getCurAddressField() {
		return driver.findElement(By.id("currentAddress"));
	}

	public WebElement getPermAddressField() {
		return driver.findElement(By.id("permanentAddress"));
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(By.id("submit"));
	}

	public WebElement getOutputName() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getOutputEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getOutputCurAddress() {
		return driver.findElement(By.xpath("//*[@id=\"output\"]//p[@id=\"currentAddress\"]"));
	}

	public WebElement getOutputPermAddress() {
		return driver.findElement(By.xpath("//*[@id=\"output\"]//p[@id=\"permanentAddress\"]"));
	}

	public void inputUsername(String username) {
		getUsernameField().clear();
		getUsernameField().sendKeys(username);
	}

	public void inputEmail(String email) {
		getEmailField().clear();
		getEmailField().sendKeys(email);
	}

	public void inputCurrentAddress(String currentAddress) {
		getCurAddressField().clear();
		getCurAddressField().sendKeys(currentAddress);
	}

	public void inputPermanentAddress(String permanentAddress) {
		getPermAddressField().clear();
		getPermAddressField().sendKeys(permanentAddress);
	}

	public void clickSubmitBtn() throws InterruptedException {
		getSubmitBtn().click();

	}

}
