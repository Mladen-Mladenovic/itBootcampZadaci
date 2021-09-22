package seleniumOsnove;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Otici na sajt demoqa, kliknuti na Elements, kliknuti na Text Box, popuniti podatke i kliknuti na Submit. 
 * Sa leve strane kliknuti na Checkbox. Cekirati samo "Desktop" i utvrditi da je samo taj checkbox cekira. 
 * Kliknuti na Radio Button sa leve strane, kliknuti na "Yes" pa na "Impressive" i utvrditi da se radio button promenio.
 */
public class Selenium4c {
	private static String url = "https://demoqa.com/";
	private static String username = "Ime i Prezime";
	private static String email = "nekimejl@domen.com";
	private static String cAddress = "nekaAdresa";
	private static String pAddress = "NekaDrugaAdresa";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// Inicijalni
		initial(driver, wait);

		// Text Box
		textBox(driver, wait);

		// Check Box
		checkBox(driver, wait);

		// Radio Button
		radioButton(driver, wait);
	}

	// Otici na sajt demoqa, kliknuti na Elements, kliknuti na Text Box
	public static boolean initial(WebDriver driver, WebDriverWait wait) {
		driver.navigate().to(url);
		WebElement elementsButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		elementsButton.click();

		// wait.until(ExpectedConditions.elementToBeClickable(By.id("item-0")));
		WebElement elementsList = driver.findElement(By.id("item-0"));
		elementsList.click();
		if (driver.getCurrentUrl().equals("https://demoqa.com/elements")) {
			return true;
		} else {
			return false;
		}
	}

	// Popuniti podatke i kliknuti na Submit
	public static boolean textBox(WebDriver driver, WebDriverWait wait) {
		WebElement userNameField = driver.findElement(By.id("userName"));
		userNameField.clear();
		userNameField.sendKeys(username);

		WebElement emailField = driver.findElement(By.id("userEmail"));
		emailField.clear();
		emailField.sendKeys(email);

		WebElement addressField = driver.findElement(By.id("currentAddress"));
		addressField.clear();
		addressField.sendKeys(cAddress);

		WebElement permAdressField = driver.findElement(By.id("permanentAddress"));
		permAdressField.clear();
		permAdressField.sendKeys(pAddress);

		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		try {
			WebElement nameOut = driver.findElement(By.id("name"));
			WebElement emailOut = driver.findElement(By.id("email"));
			WebElement cAddressOut = driver.findElement(By.id("currentAddress"));
			WebElement pAddressOut = driver.findElement(By.id("permanentAddress"));

			if (nameOut.isDisplayed() && emailOut.isDisplayed() && cAddressOut.isDisplayed()
					&& pAddressOut.isDisplayed()) {
				System.out.println("PASS - TextBox  - Output is visible.");
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAIL - TexBox - No output detected.");
			return false;
		}
		return false;
	}

	// Kliknuti na Checkbox. Cekirati samo "Desktop" i utvrditi da je samo taj
	// checkbox cekira.
	public static boolean checkBox(WebDriver driver, WebDriverWait wait) {
		WebElement checkBoxButton = driver.findElement(By.id("item-1"));
		checkBoxButton.click();

		WebElement expandTree = driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
		expandTree.click();

		WebElement desktopButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label"));
		desktopButton.click();

		WebElement expandDesktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
		expandDesktop.click();

		List<WebElement> desktopOut = null;

		try {
			desktopOut = driver.findElements(By.id("result"));

			if (desktopOut.get(0).getText().equals("You have selected :\n" + "desktop\n" + "notes\n" + "commands")) {

				System.out.println("PASS - Checkbox");
				return true;
			} else {
				System.out.println("FAIL - Checkbox - Wrong output.");
				return false;
			}
		} catch (Exception e) {
			System.out.println("FAIL - Checkbox - No output detected.");
			return false;
		}
	}

	// Kliknuti na Radio Button sa leve strane, kliknuti na "Yes" pa na "Impressive"
	// i utvrditi da se radio button promenio.
	public static boolean radioButton(WebDriver driver, WebDriverWait wait) {
		WebElement radioButtonButton = driver.findElement(By.id("item-2"));
		radioButtonButton.click();

		WebElement yesRadio = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]"));
		yesRadio.click();

		WebElement impressiveRadio = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
		impressiveRadio.click();

		try {
			if (driver.findElement(By.className("text-success")).getText().equals("Impressive")) {
				System.out.println("PASS - Radio Button");
				return true;
			} else {
				System.out.println("FAIL - Radio Button - Wrong selection:"
						+ driver.findElement(By.className("text-success")).getText() + " instead of 'Impressive'");
				return false;
			}
		} catch (Exception e) {
			System.out.println("FAIL - Radio Button - No output detected.");
			return false;
		}
	}
}
