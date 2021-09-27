package test01;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base01.BaseDemoQa;

public class TestDemoQa extends BaseDemoQa {

	String url = "https://demoqa.com/";
	String name = "Neko Ime";
	String email = "imejl@nesto.com";
	String currentAddress = "TrenutnaAdressa";
	String permanentAddress = "StalnaAdressa";
	String checkBoxOutput = "You have selected :\ndesktop\nnotes\ncommands";
	String radioButtonOutput = "Impressive";

	@BeforeClass
	public void pageSetUp() {
		driver.navigate().to(url);
		
	}

	@Test(priority = 10)
	public void textBoxCorrectOutput() throws InterruptedException {
		frontPageDemoQa.clickOnElementsButton();
		elementsPageDemoQa.clickOnTextBoxBtn();
		textBoxDemoQa.inputUsername(name);
		textBoxDemoQa.inputEmail(email);
		textBoxDemoQa.inputCurrentAddress(currentAddress);
		textBoxDemoQa.inputPermanentAddress(permanentAddress);
		textBoxDemoQa.clickSubmitBtn();

		Assert.assertEquals(textBoxDemoQa.getOutputName().getText(), "Name:"+name);
		Assert.assertEquals(textBoxDemoQa.getOutputEmail().getText(), "Email:"+email);
		Assert.assertEquals(textBoxDemoQa.getOutputCurAddress().getText(), "Current Address :"+currentAddress);
		Assert.assertEquals(textBoxDemoQa.getOutputPermAddress().getText(), "Permananet Address :"+permanentAddress);
	}

	@Test(priority = 20)
	public void checkBoxDesktopSelection() throws InterruptedException {
		elementsPageDemoQa.clickCheckBoxBtn();
		checkBoxDemoQa.clickExpandArrow();
		checkBoxDemoQa.selectDeskopBox();

		Assert.assertEquals(checkBoxDemoQa.getSuccessText().getText(), checkBoxOutput);
	}

	@Test(priority = 30)
	public void radioButtonFromYesToImpressive() throws InterruptedException {
		elementsPageDemoQa.clickRadioBoxBtn();
		radioButtonDemoQa.selectYes();
		radioButtonDemoQa.selectImpressive();

		Assert.assertEquals(radioButtonDemoQa.getOutputText().getText(), radioButtonOutput);
	}
}
