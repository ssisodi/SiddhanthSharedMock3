package testPackBarclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BarclayPomClasses.Homepage;

public class BarclayTestNG {
	WebDriver driver;
	
	@BeforeClass
	public void a()
	{
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://home.barclays/");
		driver.manage().window().maximize(); 
		System.out.println("Before class");	
	}
	
	@BeforeMethod
	public void c()
	{
		System.out.println("Before Method");
	}	
	
  @Test
  public void Test1() throws InterruptedException{
	  
	  Homepage homepage = new Homepage(driver); 
	  homepage.moveToOtherSites();
	  
  }
  
  @Test 
  public void Test2() throws InterruptedException
  {
	  Homepage homepage = new Homepage(driver); 
	  homepage.clickOnPersonalBanking(driver);
  } 
  
}
