package POJO;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
	
	
	
	public static WebDriver browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Latika\\eclipse-workspace\\ZerodhaProject\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//log.info("Launch browser successfull");
		return driver;
	}

	

	
	

}
