package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class=\"page-title big\"]") private WebElement HompageHead;
	@FindBy (xpath="//input[@type=\"text\"]") private WebElement searchCompany;

	
	public boolean checkHomepageHeading() {
		
		System.out.println(HompageHead.getText());
		return HompageHead.isDisplayed();
	}
	
	public void enterSearch() {
		
		searchCompany.sendKeys("hdfc");
	}
	public boolean checkSearchDisplay() {
		
		return searchCompany.isEnabled();
	}
		

	
	

}
