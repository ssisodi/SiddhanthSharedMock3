package pack123;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 extends Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32_110\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lexus.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		captureScreenshot(driver); 
	}

}
