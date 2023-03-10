package BarclayPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	private Actions act; 
	private String mainpage;
	
	//Variable - private Webelements 
	
	@FindBy(xpath = "//a[text() ='Other Barclays sites']")
	private WebElement OtherSites; 
	
	@FindBy(xpath = "//a[contains(text(),'Personal Banking')]")
	private WebElement PersonalBanking; 
	
	@FindBy(xpath = "//a[contains(text(),'Business Banking')]")
	private WebElement BusinessBanking; 
	
	@FindBy(xpath = "( //a[contains(text(),'Corporate Banking')])[1]")
	private WebElement CorporateBanking; 
	
	@FindBy(xpath ="//a[text() = 'Investors']")
	private WebElement InvestTab; 
	
	@FindBy(xpath = "//a[text() = 'Investors']")
	private WebElement TabInvest; 
	
	@FindBy(xpath = "//a[contains(text(),'Share price ')]")
	private WebElement SharePrice; 
	
	@FindBy(xpath = "//button[contains(text(),'More Stories')]")
	private WebElement MoreStories; 

	//Constructor for WebElement Initialization (public) 
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
		act = new Actions(driver);
		mainpage = driver.getWindowHandle();
	}
	
	//Methods for WebElement actions
	
	public void moveToOtherSites() throws InterruptedException 
	{	
		Thread.sleep(2000);
		String actualtext = OtherSites.getText(); 
		String expectedtext = "Other Barclays sites"; 
		boolean result = OtherSites.isEnabled();
		if(actualtext.equals(expectedtext) && result == true)
		{
			System.out.println("Other Barclays sites tab is functioning correctly");
		}
		else 
		{
			System.out.println("Other Barclays sites tab is functioning correctly");
		}
		act.moveToElement(OtherSites).perform();
		
		/*
		if(result == true)
		{
			System.out.println("Other Barclays sites tab is enabled");
		}
		else 
		{
			System.out.println("Other Barclays sites tab is disabled");
		}*/
		
	}
	
	public void clickOnPersonalBanking(WebDriver driver) throws InterruptedException
	{
		try {
		Thread.sleep(5000);
		act.moveToElement(PersonalBanking).perform(); 
		boolean result = PersonalBanking.isEnabled();
		if(result == true)
		{
			System.out.println("Personal banking tab is enabled");
		}
		else 
		{
			System.out.println("Personal banking tab is disabled");
		}
		Thread.sleep(1000);
		act.click().perform();	// Personal banking webpage is clicked
		Thread.sleep(1000);
		driver.switchTo().window(mainpage); // Switch back to Homepage
		Thread.sleep(1000);
		act.moveToElement(OtherSites).perform();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

