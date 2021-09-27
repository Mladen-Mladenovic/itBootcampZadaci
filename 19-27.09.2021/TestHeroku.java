package test01;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base01.BaseHeroku;

public class TestHeroku extends BaseHeroku {

	@BeforeMethod
	public void pageSetup() {
		String url = reader.getStringData("Sheet1", 1, 0);
		driver.navigate().to(url);
	}

	@Test(priority = 10)
	public void insertCorrectCreds() {
		loginPageHeroku.insertUsername(reader.getStringData("Sheet1", 1, 1));
		loginPageHeroku.insertPassword(reader.getStringData("Sheet1", 1, 2));
		loginPageHeroku.clickLoginButton();

		Assert.assertTrue(
				logoutPageHeroku.getSuccessMessage().getText().contains(reader.getStringData("Sheet1", 1, 6)));
		Assert.assertTrue(logoutPageHeroku.getLogoutButton().isDisplayed());
	}

	@Test(priority = 20)
	public void insertIncorrectUsername() {
		for (int i = 1; i < reader.getSheet().getLastRowNum(); i++) {
			String username = reader.getStringData("Sheet1", i, 3);
			String password = reader.getStringData("Sheet1", 1, 2);
			loginPageHeroku.insertUsername(username);
			loginPageHeroku.insertPassword(password);
			loginPageHeroku.clickLoginButton();
			Assert.assertTrue(
					loginPageHeroku.getErrorMessage().getText().contains(reader.getStringData("Sheet1", 2, 5)));
			try {
				Assert.assertTrue(!logoutPageHeroku.getLogoutButton().isDisplayed());
			} catch (Exception NoSuchElementException) {

			}

		}
	}

	@Test(priority = 30)
	public void insertIncorrectPassword() {
		for (int i = 0; i < reader.getSheet().getLastRowNum(); i++) {
			String username = reader.getStringData("Sheet1", 1, 1);
			String password = reader.getStringData("Sheet1", i, 4);
			loginPageHeroku.insertUsername(username);
			loginPageHeroku.insertPassword(password);
			loginPageHeroku.clickLoginButton();
			Assert.assertTrue(
					loginPageHeroku.getErrorMessage().getText().contains(reader.getStringData("Sheet1", 1, 5)));
			try {
				Assert.assertTrue(!logoutPageHeroku.getLogoutButton().isDisplayed());
			} catch (Exception NoSuchElementException) {

			}
		}
	}

}
