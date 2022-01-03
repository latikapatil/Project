package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyShare {
	
	@FindBy (xpath="//input[@type=\"text\"]") private WebElement searchCompany;
	@FindBy (xpath = "//span[text()=\"HDFC\"]") private WebElement HDFC;
	@FindBy(xpath = "(//input[@type=\"radio\"])[3]") private WebElement regular;
	@FindBy (xpath = "(//button[@type=\"button\"])[1]") private WebElement buy;
	@FindBy(xpath = "(//input[@type=\"radio\"])[6]") private WebElement intraday;
	@FindBy(xpath ="(//input[@type=\"radio\"])[9]") private WebElement limit;
	@FindBy(xpath = "(//input[@type=\"radio\"])[8]") private WebElement market;
	@FindBy(xpath = "(//input[@type=\"number\"])[2]") private WebElement Price;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement BuyButton;
	@FindBy(xpath="//button[@class=\"button-outline cancel\"]")private WebElement buycancel;
	@FindBy(xpath="//div[text()=\"Markets are closed right now. Use GTT for placing long standing orders instead. \"]") private WebElement error;
	@FindBy(xpath="(//input[@type=\"radio\"])[5]") private WebElement AMO;	
	
	
	public BuyShare(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchCo() {
		searchCompany.sendKeys("HDFC");
	}
	public void clickOnCo(WebDriver driver) {
		
		Actions company = new Actions(driver);
		company.moveToElement(HDFC).perform();
	}
	public void clickBuy() {
		buy.click();
	}
	public void clickRegular() {
		regular.click();
	}
	public void clickIntraday(WebDriver driver) {
		JavascriptExecutor intraday1= (JavascriptExecutor) driver;
		intraday1.executeScript("arguments[0].click();", intraday);
	}
	public void clickLimitO(WebDriver driver)
	{
		JavascriptExecutor limito= (JavascriptExecutor) driver;
		limito.executeScript("arguments[0].click();", limit);
	}
	public void clickMarket(WebDriver driver)
	{
		JavascriptExecutor marketo= (JavascriptExecutor) driver;
		marketo.executeScript("arguments[0].click();", market);
	}
	public void clearPrice() {
		Price.clear();
	}
	public void enterPrice()
	{
		Price.sendKeys("2578");
	}
	public void buyShare()
	{
		BuyButton.click();
	}
	public void clickAmo(WebDriver driver) {
		JavascriptExecutor amo= (JavascriptExecutor) driver;
		amo.executeScript("arguments[0].click();", AMO);
	}
	public void clickCancel() {
		
		if(error.isDisplayed()==true)
		{
			buycancel.click();
		}
	}
	


	

}
