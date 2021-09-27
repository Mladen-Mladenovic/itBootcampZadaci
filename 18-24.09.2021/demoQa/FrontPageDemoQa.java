package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontPageDemoQa {

	WebDriver driver;
	WebElement elements;

	public FrontPageDemoQa(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getElements() {
		return driver.findElement(By.xpath(
				"//*[@d=\"M16 132h416c8.837 0 16-7.163 16-16V76c0-8.837-7.163-16-16-16H16C7.163 60 0 67.163 0 76v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16z\"]/../..")); // "/html/body/div[2]/div/div/div[2]/div/div[1]"
	}

	public void clickOnElementsButton() {
		getElements().click();
	}

}
