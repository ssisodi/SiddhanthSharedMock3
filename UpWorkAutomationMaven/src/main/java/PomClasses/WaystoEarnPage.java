package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaystoEarnPage {

	@FindBy (xpath = "//div[@id = 'btn-2']")
	private WebElement CreateProfile; 
	
	//Constructor - Public - WebElement Initialization
	public WaystoEarnPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods - Public - Web Elements action 
	public void clickCreateProfile()
	{
		CreateProfile.click();
	}
}
