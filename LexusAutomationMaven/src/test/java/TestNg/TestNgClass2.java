package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LexusPomClasses.AccessoriesPage;
import LexusPomClasses.ExteriorColorPage;
import LexusPomClasses.InteriorColorPage;

public class TestNgClass2 {

	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName)
	{
	
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\geckodriver-v0.32.1-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\operadriver_win32\\operadriver_win32\\operadriver.exe");
			driver = new OperaDriver();
		}
		if(browserName.equals("MicrosoftE"))
		{
			System.setProperty("webdriver.edge.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		System.out.println("Before test");
	}
	

	@BeforeClass
	public void defaultDriver() {
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();	*/
/*	System.setProperty("webdriver.gecko.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\geckodriver.exe");
	driver = new FirefoxDriver();*/
		driver.get("https://www.lexus.com/build-your-lexus/#!/zip/91801/series/UXh/year/2023/trim/9735/buildId/102");
	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{	
		Thread.sleep(3000); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("*************************************");
		System.out.println("Before Method ran before each test");
	}
	
	  
	  @Test
		public void Test3() throws InterruptedException
	{
		  try {
			  System.out.println("-------------------------------------------------");  
			System.out.println("Test case 3 - Exterior color page");
			ExteriorColorPage exteriorcolor = new ExteriorColorPage(driver); 
			exteriorcolor.selectExtColor();// Clicking the Exterior color before testing
			String actcolor = exteriorcolor.verifyExtColor(); 
			System.out.println(actcolor);
			String expcolor = "Cloudburst Gray* with Obsidian roof";
			if(actcolor.equals(expcolor))
			{
				System.out.println("Exterior color type is matched");
			}
			else 
			{
				System.out.println("Exterior color type is not matched");
			}
			//-----------------------------------------------------------
			Thread.sleep(2000);
			boolean nexttab = exteriorcolor.testNextButton(); 
			if(nexttab == true)
			{
				System.out.println("Next:Interior button is enabled");
			}
			else 
			{
				System.out.println("Next:Interior button is disabled");
			}		
			
			exteriorcolor.clickNext(); // Clicking the Next:Interior tab after testing
		 }
		  catch(Exception e)
		  	{
			  System.out.println(e);
		  	}
	}
//---------------------------------------------------------------------------------------------------------------------------	  
		@Test
		public void Test4() throws InterruptedException
		{
			try {
				System.out.println("-------------------------------------------------");	
				System.out.println("Test case 4 - Interior color page");
			InteriorColorPage interiorcolor = new InteriorColorPage(driver);
			interiorcolor.selectIntColor(); // Interior color selected before testing 
			String actIntcolor = interiorcolor.verifyIntColor(); 
		//	System.out.println(actIntcolor);
			String expIntcolor = "Black NuLuxe® and Black washi dash trim"; 
			if(actIntcolor.equals(expIntcolor))
			{
				System.out.println("Interior color is matched");
			}
			else 
			{
				System.out.println("Interior color is not matched");
			}
			
			//-----------------------------------------------------------
			Thread.sleep(2000);
			boolean nextpac = interiorcolor.testnextPackage(); 
			if(nextpac == true)
			{
				System.out.println("Next:Package button is enabled");
			}
			else 
			{
				System.out.println("Next:Package button is disabled");
			}
			interiorcolor.clickNext();// Next package button clicked after testing 
			 System.out.println("-------------------------------------------------");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
//---------------------------------------------------------------------------------------------------------------------------		
		@Test
		public void Test5()
		{
			try {
				System.out.println("-------------------------------------------------");	
				System.out.println("Test case 5 - Accessories page");
				AccessoriesPage accessories = new AccessoriesPage(driver); 
				//AUTO-DIMMING REARVIEW MIRROR
				String actmatch1 = accessories.verifyAutoDim(); 
				String expmatch1 = "AUTO-DIMMING REARVIEW MIRROR";
				if(actmatch1.equals(expmatch1))
				{
					accessories.add1stItem(); // AUTO-DIMMING REARVIEW MIRROR item is added
					System.out.println("Item 1 got added");
				}
				else 
				{
					System.out.println("Cannot add this Item 1");
				}
				//COLOR HEAD-UP DISPLAY
				String actmatch2 = accessories.verifyHeadUp(); 
				String expmatch2 = "COLOR HEAD-UP DISPLAY";
				if(actmatch2.equals(expmatch2))
				{
					accessories.add2ndItem();// COLOR HEAD-UP DISPLAY item is added
					System.out.println("Item 2 got added");
				}else 
				{
					System.out.println("Cannot add this Item 2");
				}
				//WIRELESS CHARGER
				String actmatch3 = accessories.verifyWirelessC(); 
				String expmatch3 = "WIRELESS CHARGER*";
				if(actmatch3.equals(expmatch3))
				{
					accessories.add3rdItem();//WIRELESS CHARGER item is added
					System.out.println("Item 3 got added");
				}
				else 
				{
					System.out.println("Cannot add this Item 3");
				}
				//INTUITIVE PARKING ASSIST
				String actmatch4 = accessories.verifyIntuitPark(); 
				String expmatch4 = "INTUITIVE PARKING ASSIST*";
				if(actmatch4.equals(expmatch4))
				{
					accessories.add4thItem();
					System.out.println("Item 4 got added");
				}
				else 
				{
					System.out.println("Cannot add this Item 4");
				}
				//POWER REAR DOOR WITH KICK SENSOR	
				String actmatch5 = accessories.verifyPowerSensor(); 
				String expmatch5 = "POWER REAR DOOR WITH KICK SENSOR"; 
				if(actmatch5.equals(expmatch5))
				{
					accessories.add5thItem();
					System.out.println("Item 5 got added");
				}
				else 
				{
					System.out.println("Cannot add this Item 5");
				}
				//HEATED STEERING WHEEL
				String actmatch6 = accessories.verifyHeaterWheel(); 
				String expmatch6 = "HEATED STEERING WHEEL"; 
				if(actmatch6.equals(expmatch6))
				{
					accessories.add6thItem();
					System.out.println("Item 6 & 7 got added");
				}
				else {
					System.out.println("Cannot add this Item 6 & 7");
				}
				Thread.sleep(3000);
				//WINDSHIELD WIPER DE-ICER
				String actmatch7 = accessories.verifyDeIcer(); 
				String expmatch7 = "WINDSHIELD WIPER DE-ICER";
				if(actmatch7.equals(expmatch7))
				{
					accessories.add8Item();
					System.out.println("Item 8 got added");
				}
				else 
				{
					System.out.println("Cannot add this Item 8");
				}
				// Next: Accessories
				boolean actmatch8 = accessories.verifyNextAcc(); 
				if(actmatch8 == true)
				{
					System.out.println("Next: Accessories is enabled");
					accessories.clickNextAcc();
				}
				else
				{
					System.out.println("Next: Accessories is disabled");
				}			
			}
			catch(Exception e)
			{
				
			}
		}	

		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After Method");
		}
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("After Class");
		}

		@AfterTest
		public void afterTest()
		{
			driver.quit();
			System.out.println("After test");
		}
		
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("After suite for TestNg Class 1 ");
		}

}
