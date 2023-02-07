package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClientOrFreelancePage {


	@FindBy (xpath = "//button[contains(text(),'Apply as a ')]")
	private WebElement ClientOrFreelance; 
	
	//Constructor - Public - WebElement Initialization
		public ClientOrFreelancePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		//Methods - Public - Web Elements action 
		public void applyOption()
		{
			ClientOrFreelance.click();
		}

}

