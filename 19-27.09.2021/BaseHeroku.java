package base01;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages01.LoginPageHeroku;
import pages01.LogoutPageHeroku;

public class BaseHeroku {

	public WebDriver driver;
	public WebDriverWait wait;
	public LoginPageHeroku loginPageHeroku;
	public LogoutPageHeroku logoutPageHeroku;
	public ExcelReader01 reader;

	@BeforeClass
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		reader = new ExcelReader01("/Users/mladenimac/itbootcamp/VezbaHerokuCred.xlsx");

		loginPageHeroku = new LoginPageHeroku(driver, wait, reader);
		logoutPageHeroku = new LogoutPageHeroku(driver, wait, reader);
	}

	@AfterClass
	public void tearDown() {
		// driver.close();
	}
}
