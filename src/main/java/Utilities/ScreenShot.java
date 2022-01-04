package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import POJO.LaunchBrowser;

public class ScreenShot {

	
	public static void captureScreenshot(String snap,WebDriver driver) throws IOException, InterruptedException {
		
		
		//WebDriver driver = LaunchBrowser.browser();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destnation = new File ("C:\\Git\\Project\\Project\\Screenshot\\"+snap+".jpeg");
		FileHandler.copy(source, destnation);
	}

	
}
