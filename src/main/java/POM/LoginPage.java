package POM;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ReadExcel;

public class LoginPage{
	
	WebDriver driver;
	
	@FindBy(xpath="//h2[text()='Login to Kite']") private WebElement loginheader;
	@FindBy(xpath = "//input[@id=\"userid\"]") private WebElement user;
	@FindBy(xpath = "//input[@id=\"password\"]") private WebElement pass;
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement login;
	@FindBy(xpath = "//a[@href=\"/forgot\"]") private WebElement forgetpass;
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath ="//button[@type=\"submit\"]") private WebElement submit;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkLoginHeader() {
		
		return loginheader.getText();
		
	}
	public void enterUsername(String Username) throws IOException {
		
		user.sendKeys(Username);
	}
	public void enterPassword(String Password)
	{
		pass.sendKeys(Password);
	}
	
public  boolean CheckLoginEnabled() {
		
		return login.isEnabled();
	}
	public void clickLoginButton() {
		login.click();
	}
	public void enterPin(String Pin)
	{
		pin.sendKeys(Pin);
		
		
	}
	public void clickSubmitButton() {
		submit.click();
	}

	
	}
	
	
	


