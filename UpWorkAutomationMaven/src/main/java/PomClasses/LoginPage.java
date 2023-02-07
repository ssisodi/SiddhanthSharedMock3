package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input [@id = 'login_username']")
	private WebElement loginPage;
	
	// Constructor - Public - WebElement Initialization
	public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	//	Methods - Public - Web Elements action
			
		public void sendLoginId()
		{
			loginPage.sendKeys("sisodiasiddhanth@gmail.com");
		}
			
}
