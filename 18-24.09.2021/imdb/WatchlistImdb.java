package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchlistImdb {

	WebDriver driver;
	WebDriverWait wait;
	WebElement sortByList;
	WebElement dateAddedButton;
	String firstFilmUrl;

	public WatchlistImdb(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getSortByList() {
		return driver.findElement(By.id("lister-sort-by-options"));
	}

	public WebElement getDateAddedButton() {
		return driver.findElement(By.xpath("//*[@value=\"DATE_ADDED\"]"));
	}

	public void clickSortByList() {
		getSortByList().click();
	}

	public void clickDateAddedButton() {
		getDateAddedButton().click();
	}

	public String getFirstFilmUrl() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class=\"lister-item-header\"]/a")));
		WebElement firstFilmUrl = driver.findElement(By.xpath("//h3[@class=\"lister-item-header\"]/a"));
		String editedUrl = firstFilmUrl.getAttribute("href").replaceFirst("\\?(.*)", "");
		return editedUrl;
	}

}
