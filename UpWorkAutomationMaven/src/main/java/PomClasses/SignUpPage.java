package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	@FindBy(xpath = "//input [@id ='first-name-input']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input [@id ='last-name-input']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input [@id ='redesigned-input-email']")
	private WebElement email; 
	
	@FindBy(xpath = "//input [@id ='password-input']")
	private WebElement password;
	
	@FindBy(xpath = "//a[contains(text(),'Want to log in?')]")
	private WebElement optionallogin;
	
	// Constructor - Public - WebElement Initialization
		public SignUpPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//Methods - Public - Web Elements action 
		public void sendFirstName()
		{
			firstName.sendKeys("Siddhanth");
		}
		public void sendLastName()
		{
			lastName.sendKeys("Sisodia");
		}
		public void sendEmail()
		{
			email.sendKeys("sisodiasiddhanth@gmail.com");
		}
		public void sendPassword() {
			password.sendKeys("P@ssW0rD");
		}
		public void chooseLogin()
		{
			optionallogin.click();
		}	
}

