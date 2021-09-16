/*
 * Napisati program koji ucitava https://practicetestautomation.com/ stranicu, 
 * klikne na "Practice" i klikne na "Test login page", 
 * popunjava username i password (student/Password123),
 * loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. 
 * Na kraju zatvoriti program.
 */
package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class domaciSelenium01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String username = "student";
		String password = "Password123";
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		
		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.clear();
		usernameInput.sendKeys(username);
		
		WebElement passInput = driver.findElement(By.id("password"));
		passInput.clear();
		passInput.sendKeys(password);
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();		
		
		WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logOutButton.click();
		
		driver.close();
	}

}
