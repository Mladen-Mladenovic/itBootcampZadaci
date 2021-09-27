package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base01.ExcelReader01;

public class LoginPageHeroku {

	WebDriver driver;
	WebDriverWait wait;
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginButton;
	WebElement errorMessage;

	public LoginPageHeroku(WebDriver driver, WebDriverWait wait, ExcelReader01 reader) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("username"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLoginButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.className("radius")));
		return driver.findElement(By.className("radius"));
	}

	public WebElement getErrorMessage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flash.error")));
		return driver.findElement(By.cssSelector(".flash.error"));
	}

	public void insertUsername(String username) {
		getUsernameField().clear();
		getUsernameField().sendKeys(username);
	}

	public void insertPassword(String password) {
		getPasswordField().clear();
		getPasswordField().sendKeys(password);
	}

	public void clickLoginButton() {
		getLoginButton().click();
	}

}
