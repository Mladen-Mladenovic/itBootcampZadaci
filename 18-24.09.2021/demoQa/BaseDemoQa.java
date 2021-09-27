package base01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages01.CheckBoxDemoQa;
import pages01.ElementsPageDemoQa;
import pages01.FrontPageDemoQa;
import pages01.RadioButtonDemoQa;
import pages01.TextBoxDemoQa;

public class BaseDemoQa {

	public WebDriver driver;
	public WebDriverWait wait;
	public FrontPageDemoQa frontPageDemoQa;
	public ElementsPageDemoQa elementsPageDemoQa;
	public TextBoxDemoQa textBoxDemoQa;
	public CheckBoxDemoQa checkBoxDemoQa;
	public RadioButtonDemoQa radioButtonDemoQa;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);

		frontPageDemoQa = new FrontPageDemoQa(driver);
		elementsPageDemoQa = new ElementsPageDemoQa(driver);
		textBoxDemoQa = new TextBoxDemoQa(driver);
		checkBoxDemoQa = new CheckBoxDemoQa(driver);
		radioButtonDemoQa = new RadioButtonDemoQa(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
