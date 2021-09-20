package loginPageVezba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Test {

	private String url = "https://the-internet.herokuapp.com/login";

	public String getUrl() {
		return url;
	}

	public boolean test(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to(url);
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.clear();
		usernameField.sendKeys(username);

		WebElement passField = driver.findElement(By.id("password"));
		passField.clear();
		passField.sendKeys(password);

		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();
		if (!driver.getCurrentUrl().equals(url)) {
			if (driver.findElement(By.cssSelector(".button.secondary.radius")).isDisplayed()) {
				System.out.println("PASS");
				driver.close();
				return true;
			} else {
				System.out.println("FAIL - Logout button not displayed.");
				driver.close();
				return false;
			}
		} else {
			System.out.println("FAIL - Url before login same as after.");
			driver.close();
			return false;
		}

	}

}
