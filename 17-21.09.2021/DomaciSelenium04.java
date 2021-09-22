package seleniumOsnove;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Pomocu jave i selenijuma
 * 1) otici na sajt youtube
 * 2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
 * voditi racuna da ako postoje reklame da ih preskocite
 * 3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video
 */
public class DomaciSelenium04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String url = "https://www.youtube.com/";
		String searchQ = "Rick Astley";
		String songName = "never gonna give you up";
		ArrayList<WebElement> songList = new ArrayList<WebElement>();
		
		driver.navigate().to(url);
		// Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search']")));
		WebElement searchFieldGray = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchFieldGray.click();
		searchFieldGray.sendKeys(searchQ);
		searchFieldGray.sendKeys(Keys.ENTER);

		Thread.sleep(1000); // Mora da se čeka fiksno osim ako ne pravimo svoju ExpectedCondition metodu.
		songList = (ArrayList<WebElement>) driver.findElements(By.id("video-title"));
	
		for (int i = 0; i < songList.size(); i++) {
			String slName = songList.get(i).getAttribute("title");
			if (slName.toLowerCase().contains(songName)) {
				songList.get(i).click();
				break;
			}
		}
		// Thread.sleep(5000);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"items\"]/ytd-compact-video-renderer[2]")));
		WebElement secondVideo = driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-compact-video-renderer[2]"));
		secondVideo.click();
	}

}
