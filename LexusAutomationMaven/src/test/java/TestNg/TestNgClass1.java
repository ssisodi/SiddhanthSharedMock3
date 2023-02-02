package TestNg;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import LexusPomClasses.AccessoriesPage;
	import LexusPomClasses.ExteriorColorPage;
	import LexusPomClasses.InteriorColorPage;
	import LexusPomClasses.LexusHomePage;
	import LexusPomClasses.PincodePage;
	import LexusPomClasses.SummaryPage;

	public class TestNgClass1 {
		WebDriver driver;
		
		@BeforeClass
		public void defaultDriver() {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		driver.get("https://www.lexus.com/");
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
//---------------------------------------------------------------------------------------------------------------------------
		@Test
	  public void Test1() throws InterruptedException {
		
		  try {
			  System.out.println("-------------------------------------------------");
		  System.out.println("Test case 1 - Homepage");
		  LexusHomePage homepage = new LexusHomePage(driver); 
		  String expresult = "VEHICLES"; 
		  String result = homepage.testVehicletab();
		  System.out.println(result);
		  if(result.equals(expresult))
		  {
			  System.out.println("Vehicles dropdown menu successfull");
			  homepage.cursorOnVehicleTab();
		  }
		  else 
		  {
			  System.out.println("Vehicles dropdown menu unsuccessful");
		  }
		 
		  Thread.sleep(2000);
		//-----------------------------------------------------------
		  String exptext1 = "SEDAN"; 
		  String exptext2 = "HYBRID & ELECTRIC"; 
		  String exptext3 = "PERFORMANCE"; 
		  String exptext4 = "FUTURE"; 
		  String result1 = homepage.testSedanTab(); 
		  String result2 = homepage.testHybridTab(); 
		  String result3 = homepage.testPerformanceTab(); 
		  String result4 = homepage.futureTab(); 
		  if(result1.equals(exptext1) && result2.equals(exptext2) && result3.equals(exptext3) && result4.equals(exptext4)) 
		  {
			  System.out.println("Tabs validation successfull");
			  homepage.moveOverAllTabs();
		  }
		  else
		  {
			  System.out.println("Tabs validation unsuccessfull");
		  }
		  Thread.sleep(2000); 
		//-----------------------------------------------------------		
		 /* String exptext5 = "UX HYBRID";
		  System.out.println("exptext5"+exptext5);
		  String result5 = homepage.testFirstBlock();
		  System.out.println(result5);
		  if(result5.equals(exptext5))
		  {
			  System.out.println("First block Selected");
			  homepage.moveOverFirstBlock();
			 
		  }
		  else
		  {
			  System.out.println("First block not selected");
		  }*/
		  homepage.moveOverFirstBlock();
		//-----------------------------------------------------------	
		  Thread.sleep(2000);
		  homepage.clickonBuild();  	  
		  String actualURL = driver.getCurrentUrl(); 
		  String expectedURL = "https://www.lexus.com/build-your-lexus/#!/series/UXh/";
		  if(actualURL.equals(expectedURL))
		  {
			  System.out.println("Link validation: Build URL is correct");
		  }
		  else 
		  {
			  System.out.println("Link validation: Build URL is incorrect");
		  }
		  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }
//---------------------------------------------------------------------------------------------------------------------------	  
	  @Test
	  public void Test2() throws InterruptedException
	  {
		  try {
			  System.out.println("-------------------------------------------------");
		  System.out.println("Test case 2 - Pincode & Car selection page");
		  PincodePage pincode = new PincodePage(driver);
		  boolean actresult = pincode.testPinInput();
		  if(actresult == true)
		  {
			  System.out.println("Pincode input is enabled");
		  }
		  else if(actresult == false)
		  {
			  System.out.println("Pincode input is disabled");
		  }
		  Thread.sleep(2000);
		  pincode.addPinCode(); // PinCode Entered after testing
		//-----------------------------------------------------------		  
		  Thread.sleep(2000);
		  boolean searchtab = pincode.testSearchPin();
		  if(searchtab == true)
		  {
			  System.out.println("Search button is enabled");
		  }
		  else if(searchtab == false)
		  {
			  System.out.println("Search button is diabled");
		  }
		  Thread.sleep(2000);
		  pincode.clickSearchPin();// Pincode searched after testing 
		//-----------------------------------------------------------
		  Thread.sleep(2000);
		  String acttext = pincode.verifyCarTitle(); 
		  System.out.println("Actual car title: " + acttext);
		  String exptext = "2023 UX 250h F SPORT DESIGN";
		  if(acttext.equals(exptext))
		  {
			  System.out.println("Car title matched");
		  }
		  else
		  {
			  System.out.println("Car title not matched");
		  }
		  pincode.scrollToMyCar();// Car title searched by scrolling down 
		  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }  
//---------------------------------------------------------------------------------------------------------------------------	  
	  @Test(enabled = false)
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
		@Test(enabled = false) // Remove 'enabled =False' for this test to work
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
		@Test(enabled = false) // Remove 'enabled =False' for this test to work
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

		@Test(enabled = false)// Remove 'enabled =False' for this test to work
		public void Test6()
		{
			System.out.println("-------------------------------------------------");	
			System.out.println("Test case 6 - Summary page");
			
			SummaryPage summarypage = new SummaryPage(driver); 
			boolean sumpage = summarypage.verifyNextSum();
			if(sumpage == true)
			{
				System.out.println("Next: Summary tab is enabled");
				summarypage.nextSum();
			}
			else 
			{
				System.out.println("Next: Summary tab is disabled");
			}
		}
	}


