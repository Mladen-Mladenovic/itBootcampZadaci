package pages01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarImdb {

	WebDriver driver;
	WebDriverWait wait;
	WebElement watchlistButton;

	public NavBarImdb(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getWatchlistButton() {
		return driver
				.findElement(By.cssSelector(".NavWatchlistButton-sc-1b65w5j-0.dAMWXo.imdb-header__watchlist-button"));
	}

	public void clickWatchlistButton() {
		getWatchlistButton().click();
	}

}
