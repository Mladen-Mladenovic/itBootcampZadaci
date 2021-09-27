package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxDemoQa {

	WebDriver driver;
	WebDriverWait wait;
	WebElement expandArrow;
	WebElement desktopCheckBox;
	WebElement successText;

	public CheckBoxDemoQa(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getExpandArrow() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
	}

	public WebElement getDesktopCheckBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
	}

	public WebElement getSuccessText() {
		return driver.findElement(By.id("result"));
	}

	public void clickExpandArrow() {
		getExpandArrow().click();
	}

	public void selectDeskopBox() {
		getDesktopCheckBox().click();
	}
}
