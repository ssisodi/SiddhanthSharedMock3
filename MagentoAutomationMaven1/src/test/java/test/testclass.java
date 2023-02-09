package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
	}

}
