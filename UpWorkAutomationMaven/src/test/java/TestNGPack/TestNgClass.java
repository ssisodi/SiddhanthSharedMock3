package TestNGPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.HomePage;

public class TestNgClass {
	
	WebDriver driver ; 

	@BeforeClass 
	public void beforeClass()
	{
	System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	System.out.println("Before class");	
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.upwork.com/");
		System.out.println("Before Method");
	}
	
//	@Test
//	public void test1()	{
//	System.out.println("Test case 1");
//	HomePage homepage = new HomePage(driver);
//	homepage.acceptCookies();
//	}
	
	@Test
	public void test2()	{
	System.out.println("Test case 2");
	HomePage homepage = new HomePage(driver);
	homepage.moveToFindWork(driver,"Find Work"); 
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
}
