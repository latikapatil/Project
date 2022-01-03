package TestPkage;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.BuyShare;
import POM.LoginPage;
import Utilities.ReadExcel;
import Utilities.ScreenShot;

public class ValidateBuyShare {

	WebDriver driver;
	static Logger log = Logger.getLogger(ValidateBuyShare.class.getName());

	
	@BeforeMethod
	public void login() throws IOException {
		driver = ValidateLogin.browser();
		log.info("Browser Launch Successfully");
		LoginPage login = new LoginPage(driver);
		login.enterUsername(ReadExcel.readExcel(1, 0));
		login.enterPassword(ReadExcel.readExcel(1, 1));
		login.clickLoginButton();
		login.enterPin(ReadExcel.readExcel(1, 2));
		login.clickSubmitButton();
		log.info("Login Successfully into Zerodha");
	}
	
	@Test (priority = 1)
	public void validateBuyShareIntraday() {
		
		BuyShare buy = new BuyShare(driver);
		buy.enterSearchCo();
		buy.clickOnCo(driver);
		buy.clickBuy();
		log.info("Click on Buy Sucessfully");
		//buy.clickRegular();
		buy.clickIntraday(driver);
		log.info("Click on Intraday Sucessfully");
		buy.clickMarket(driver);
		log.info("Market option on Intraday Clicked Sucessfully");
		buy.clickLimitO(driver);
		buy.clearPrice();
		buy.enterPrice();
		buy.buyShare();
		log.info("Buy Share on Intraday Sucessfully");
		buy.clickCancel();
		
	}
	@Test(priority = 2,enabled =false)
	public void validateBuyShareAmo() {
		BuyShare buy = new BuyShare(driver);
		buy.enterSearchCo();
		buy.clickOnCo(driver);
		buy.clickBuy();
		buy.clickAmo(driver);
		buy.clickIntraday(driver);
		buy.clickMarket(driver);
		buy.clickLimitO(driver);
		buy.clearPrice();
		buy.enterPrice();
		buy.buyShare();
		
	}
	
	@AfterMethod
	public void clickSnap() throws IOException, InterruptedException {
		ScreenShot.captureScreenshot("Buyshare", driver);
	}
}
