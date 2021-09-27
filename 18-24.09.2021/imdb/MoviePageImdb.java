package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoviePageImdb {

	WebDriver driver;
	WebDriverWait wait;
	WebElement addToWatchListButton;
	String movieUrl = "https://www.imdb.com/title/tt0123755/";

	public MoviePageImdb(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getAddToWatchListButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add to Watchlist']/..")));
		return driver.findElement(By.xpath("//div[text()='Add to Watchlist']/.."));
	}

	public String getMovieUrl() {
		return movieUrl;
	}

	public void setMovieUrl(String movieUrl) {
		this.movieUrl = movieUrl;
	}

	public void clickAddToWatchlistButton() throws InterruptedException {

		getAddToWatchListButton().click();
	}

	public WebElement getRemoveFromWatchListButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='In Watchlist']/..")));
		return driver.findElement(By.xpath("//div[text()='In Watchlist']/.."));
	}

	public void clickRemoveFromWatchlistButton() throws InterruptedException {
		getRemoveFromWatchListButton().click();
	}

	public void goToMovieUrl() {
		driver.navigate().to(movieUrl);
	}

	public boolean checkIfButtonTurnedToAdded() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='In Watchlist']/..")));
			if (driver.findElement(By.xpath("//div[text()='In Watchlist']/..")).isDisplayed()) {
				return true;
		} else {
			return false;
		}
	} catch (Exception NoSuchElementException){
		return false;
		
		}
	}
}