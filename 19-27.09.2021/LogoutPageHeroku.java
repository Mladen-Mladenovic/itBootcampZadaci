package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import base01.ExcelReader01;

public class LogoutPageHeroku {

	WebDriver driver;
	WebDriverWait wait;
	ExcelReader01 reader;
	WebElement successMessage;
	WebElement logoutButton;

	public LogoutPageHeroku(WebDriver driver, WebDriverWait wait, ExcelReader01 reader) {
		super();
		this.driver = driver;
		this.wait = wait;
		this.reader = reader;
	}

	public WebElement getSuccessMessage() {
		return driver.findElement(By.cssSelector(".flash.success"));
	}

	public WebElement getLogoutButton() {
		return driver.findElement(By.cssSelector(".button.secondary.radius"));
	}

}
