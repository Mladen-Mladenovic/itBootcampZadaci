package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonDemoQa {

	WebDriver driver;
	WebDriverWait wait;
	WebElement yesRadio;
	WebElement impressiveRadio;
	WebElement outputText;

	public RadioButtonDemoQa(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getYesRadio() throws InterruptedException {
		return driver.findElement(By.cssSelector("[for= yesRadio]"));
	}

	public WebElement getImpressiveRadio() {
		return driver.findElement(By.cssSelector("[for= impressiveRadio]"));
	}

	public WebElement getOutputText() {
		return driver.findElement(By.className("text-success"));
	}

	public void selectYes() throws InterruptedException {
		getYesRadio().click();
	}

	public void selectImpressive() {
		getImpressiveRadio().click();
	}

}
