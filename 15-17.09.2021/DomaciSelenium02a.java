package seleniumOsnove;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciSelenium02a {
	/*
	 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na
	 * stranicu IT Bootcamp-a Primeniti metode- get URL i Title, navigate - refresh,
	 * to, back, forward U kodu treba da se prozor maksimizuje, a pre zatvaranja
	 * drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako
	 * to ne pomaze, guglajte =) ) Dokazati da li prilikom koriscenja reci
	 * “testiranje” u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom
	 * tako sto cete napraviti screenshot stranice, nakon pretrage. Proveriti da li
	 * bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.
	 */

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");

		String url = "https://itbootcamp.rs/";

		WebDriver driver = new ChromeDriver();

		driver.navigate().to(url);
		
		Dimension pocetnaVelicina = driver.manage().window().getSize();
		driver.manage().window().maximize();

		WebElement searchButton = driver.findElement(By.className("open-search"));
		searchButton.click();

		WebElement searchField = driver.findElement(By.className("form-control"));
		searchField.clear();
		searchField.sendKeys("testiranje");
		searchField.sendKeys(Keys.ENTER);

		scrShot(driver, "/Users/mladenimac/itbootcamp/scr/scr.png");

		WebElement naslovnaButton = driver.findElement(By.id("menu-item-5107"));
		naslovnaButton.click();
		
		driver.manage().window().setSize(pocetnaVelicina);
		String endUrl = driver.getCurrentUrl();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

		if (endUrl.equals(url)) {
			System.out.println("PASS - end url: " + endUrl);
		} else {
			System.out.println("FAIL - end url: " + endUrl);
		}

	}

	/*
	 * Uzima driver i adresu u formatu adresa/imeFajla 
	 * Pravi skrinšot driver-a u momentu izvršavanja i čuva ga na adresi. 
	 * Moraju se u external JARs dodati jarovi iz biblioteke commons-io sa linka:
	 * https://commons.apache.org/proper/commons-io/download_io.cgi 
	 * Odatle se importuje FileUtils Ostalo sve već ima u Selenijum-u.
	 */
	public static void scrShot(WebDriver driver, String filePath) throws IOException {

		TakesScreenshot shot = ((TakesScreenshot) driver);
		File SrcFile = shot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(filePath);
		FileUtils.copyFile(SrcFile, DestFile);
	}
}
