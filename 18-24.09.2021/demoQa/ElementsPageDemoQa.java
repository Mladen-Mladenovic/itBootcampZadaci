package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPageDemoQa {
	WebDriverWait wait;
	WebDriver driver;
	WebElement textBoxBtn;
	WebElement checkBoxBtn;
	WebElement radioBoxbtn;

	public ElementsPageDemoQa(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getTextBoxBtn() throws InterruptedException {
		return driver.findElement(By.id("item-0"));
	}

	public void clickOnTextBoxBtn() throws InterruptedException {
		getTextBoxBtn().click();
	}

	public WebElement getCheckBoxBtn() throws InterruptedException {
		return driver.findElement(By.id("item-1"));
	}

	public void clickCheckBoxBtn() throws InterruptedException {

		getCheckBoxBtn().click();
	}

	public WebElement getRadioBoxbtn() {
		return driver.findElement(By.id("item-2"));
	}

	public void clickRadioBoxBtn() {
		getRadioBoxbtn().click();
	}

}
