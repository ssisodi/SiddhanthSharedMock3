package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.ClientOrFreelancePage;
import PomClasses.HomePage;
import PomClasses.LoginPage;
import PomClasses.SignUpPage;
import PomClasses.WaystoEarnPage;


public class TestClasses {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");					
		WebDriver driver = new ChromeDriver(); // Most preferred way
		//With this syntax we will be able to use driver for any driver including chrome. 
//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Page 1 - HOME PAGE WebElements 		
		
		driver.get("https://www.upwork.com/");//1.Launch browser
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();//2.Maximize the browser  
		
		Thread.sleep(2000);
		
		HomePage homepage = new HomePage(driver);/* Once objects of POM class is created 
		all the WebElements of HomePage POM Class are found here.*/
		homepage.acceptCookies(); 
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // JavaScript executor declared for scrolling
		
		js.executeScript("window.scrollBy(0, 1050)"); // Scrolling to "To find good companies"
		
		Thread.sleep(2000); 
		
		js.executeScript("alert('Click on learn more if you want to find good companies')"); // Alert popup on "To find good companies"
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept(); // Clicking 'ok' on the alert popup of "To find good companies"
		
		Thread.sleep(1000);
						
		js.executeScript("window.scrollBy(0, 650)"); // Scrolling to "Find talent your way"
		
		Thread.sleep(2000);
		
		js.executeScript("alert('Wanna find new talent, go ahead ! choose one amongst three')"); // Alert popup on "Find talent your way" 
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();// Clicking 'ok' on the alert popup of "Find talent your way"
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 1400)"); // Scrolling to "Find great work"
		
		Thread.sleep(2000);
		
		js.executeScript("alert('Want to find more opportunities?? Wait follow me')");// Alert popup on "Find great work"
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept(); // Clicking 'ok' on the alert popup of "Find great work"
		
		Thread.sleep(2000);
		
		homepage.moveToFindWork(driver, "Find Work"); // 'moveToFindWork' method called from HomePage POM class using HomePage Object 'homepage'. 
		homepage.moveToWaysEarn(driver); // 'moveToWaysEarn' method called from HomePage POM class using HomePage Object 'homepage'.
//-------------------------------------------------------------------------------------------------------------------------------------------
// Page 2 - Ways to earn 	
		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		WaystoEarnPage waystoearnpage = new WaystoEarnPage(driver);
		waystoearnpage.clickCreateProfile(); 
//-------------------------------------------------------------------------------------------------------------------------------------------
// Page 3 - Choosing amongst two options "Join as a client or FreeLancer"
		js.executeScript("alert('Choose Freelance option(Recommended)')");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		ClientOrFreelancePage clientfreelancepage = new ClientOrFreelancePage(driver);
		clientfreelancepage.applyOption();
//-------------------------------------------------------------------------------------------------------------------------------------------
//Page 4 - Sign up to find work you love
		
		Thread.sleep(1000);
		
		SignUpPage signuppage = new SignUpPage(driver); 
		signuppage.sendFirstName(); 
		Thread.sleep(1000);
		signuppage.sendLastName(); 
		Thread.sleep(1000);
		signuppage.sendEmail(); 
		Thread.sleep(1000);
		signuppage.sendPassword();
		Thread.sleep(1000); 
		
		js.executeScript("alert('Looks like you already have an account. Login then!')");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		signuppage.chooseLogin(); 
//-------------------------------------------------------------------------------------------------------------------------------------------
//Page 5 - Login page
		
		LoginPage loginpage = new LoginPage(driver); 
		loginpage.sendLoginId(); 		
		
	}
}
