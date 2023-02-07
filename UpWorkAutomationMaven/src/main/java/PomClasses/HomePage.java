package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//button[@id = 'onetrust-accept-btn-handler']")
	private WebElement cookies; 
	
	@FindBy (xpath = "(//button[@type='button' and @tabindex='3'])[10]/span")
	private WebElement FindWork; 
	
	@FindBy(xpath = "(//a[@role = 'menuitem'])[24]/strong")
	private WebElement WaysToEarn; 
	
	// Constructor - Public - WebElement Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods - Public - Web Elements action 
	
	public void acceptCookies()
	{
		cookies.click();
	}
	
	public void moveToFindWork(WebDriver driver, String result)
	{
		Actions act = new Actions(driver);
		act.moveToElement(FindWork).perform();
		String actualtext = FindWork.getText();
		if(actualtext.equals(result))
		{
			 System.out.println("Test case 2 Passed");
		}
		else 
		{
			System.out.println("Test case 2 Failed ");
		}
	}
	
	public void moveToWaysEarn(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(WaysToEarn).click().build().perform();		
	}	
}

