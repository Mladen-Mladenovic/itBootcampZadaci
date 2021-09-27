package base01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages01.FrontPageImdb;
import pages01.LoginPageImdb;
import pages01.MoviePageImdb;
import pages01.NavBarImdb;
import pages01.WatchlistImdb;

public class BaseImdb {

	public WebDriver driver;
	public WebDriverWait wait;
	public MoviePageImdb moviePageImdb;
	public WatchlistImdb watchlistImdb;
	public FrontPageImdb frontPageImdb;
	public LoginPageImdb loginPageImdb;
	public NavBarImdb navBarImdb;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);

		moviePageImdb = new MoviePageImdb(driver, wait);
		watchlistImdb = new WatchlistImdb(driver, wait);
		frontPageImdb = new FrontPageImdb(driver, wait);
		loginPageImdb = new LoginPageImdb(driver, wait);
		navBarImdb = new NavBarImdb(driver, wait);

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		moviePageImdb.goToMovieUrl();
		moviePageImdb.clickRemoveFromWatchlistButton();
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
