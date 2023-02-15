package pack123;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		
		Date d = new Date();
		
		String FileName = "Myname" + d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
		
		TakesScreenshot t = (TakesScreenshot)driver; 
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\ScreenshotsPractice\\"+ FileName);
		
		FileHandler.copy(src, dest);
	}
	/*
	public static void main(String arg[]) throws InterruptedException, IOException {
			
		
	System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32_110\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	
	Date d = new Date();
	
	String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
	
	TakesScreenshot t = (TakesScreenshot)driver; 
	
	File src = t.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\ScreenshotsPractice\\"+ FileName);
	
	FileHandler.copy(src, dest);
	
	}
	*/
}