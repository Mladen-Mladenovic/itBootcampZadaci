package test01;

import org.testng.Assert;
import org.testng.annotations.Test;

import base01.BaseImdb;

public class TestImdb extends BaseImdb {

	// String url = "https://www.imdb.com/";

	// UNESI USERNAME, EMAIL i PASSWORD
	String username = "USERNAME";
	String email = "EMAIL";
	String password = "PASSWORD";

//	@BeforeClass
//	public void pageSetup() {
//		
//		driver.navigate().to(url);
//		
//
//	}

	@Test(priority = 10)
	public void loginFromLoginPage() throws InterruptedException {
		loginPageImdb.goToLoginPage();
		loginPageImdb.insertEmail(email);
		loginPageImdb.insertPassword(password);
		loginPageImdb.clickLoginButton();
		Assert.assertEquals(loginPageImdb.checkIfloggedIn(username), true);
	}

	@Test(priority = 20)
	public void addToWatchList() throws InterruptedException {
		moviePageImdb.goToMovieUrl();
		moviePageImdb.clickAddToWatchlistButton();
		Assert.assertEquals(moviePageImdb.checkIfButtonTurnedToAdded(), true);
	}

	@Test(priority = 30)
	public void checkIfMovieInWatchlist() throws InterruptedException {
		navBarImdb.clickWatchlistButton();
		watchlistImdb.clickSortByList();
		watchlistImdb.clickDateAddedButton();
		Assert.assertEquals(watchlistImdb.getFirstFilmUrl(), moviePageImdb.getMovieUrl());

	}

}
