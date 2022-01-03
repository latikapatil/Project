package TestPkage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POJO.LaunchBrowser;
import POM.Homepage;
import POM.LoginPage;
import Utilities.ReadExcel;
import Utilities.ScreenShot;

public class HomePageValidation extends LaunchBrowser{
	
	
	WebDriver driver;
	
	@Test(priority = 2)
	public void validateHomePage() throws IOException, InterruptedException {
		
		driver = ValidateLogin.browser();
		LoginPage login = new LoginPage(driver);
		login.enterUsername(ReadExcel.readExcel(1,0));
		login.enterPassword(ReadExcel.readExcel(1,1));
		login.clickLoginButton();
		login.enterPin(ReadExcel.readExcel(1,2));
		login.clickSubmitButton();
		Homepage home = new Homepage(driver);
		Assert.assertTrue(home.checkSearchDisplay());
		ScreenShot.captureScreenshot("Homepage",driver);
		
		
	}
	

}
